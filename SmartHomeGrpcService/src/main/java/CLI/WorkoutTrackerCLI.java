package CLI;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import workoutTrackerService.WorkoutRequest;
import workoutTrackerService.WorkoutResponse;
import workoutTrackerService.WorkoutTrackerServiceGrpc;
import workoutTrackerService.WorkoutTrackerServiceImpl;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WorkoutTrackerCLI {
    public static void main(String[] args) {
        ManagedChannel manageService = ManagedChannelBuilder.forAddress("localhost",50053)
                .usePlaintext()
                .build();

        Scanner sc = new Scanner(System.in);
        System.out.println("Smart Home Treadmill");
        System.out.println("Please Input Training Type to check ");
        System.out.println("Walking |  Running |  Stairclimb | Cycling");
        String choice = sc.nextLine();

        System.out.println("Is this all you would like to check (y/n)");
        String yn = sc.nextLine();

        if(yn.equalsIgnoreCase("yes" )){
           
            sendRequest(manageService,choice,false);
        }else{
            System.out.println("Would you like to print all (y/n)");
            String isAll = sc.nextLine();
            if(isAll.equalsIgnoreCase("no")){
                sendRequest(manageService,choice,false);
            }else{
                sendRequest(manageService,choice,true);
            }
        }
    }

    private static void sendRequest(ManagedChannel manageService, String choice, boolean allOrSingle) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        final StreamObserver<WorkoutRequest> workoutRequestStreamObserver = WorkoutTrackerServiceGrpc.newStub(manageService)
                .workoutList(new StreamObserver<WorkoutResponse>() {
                    @Override
                    public void onNext(WorkoutResponse value) {
                        final String workoutName = value.getWorkoutName();
                        final int calorieAmount = value.getCalorieAmount();
                        System.out.println(workoutName + " in an hour burns " + calorieAmount + " amount of calories.");
                    }

                    @Override
                    public void onError(Throwable t) {
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        countDownLatch.countDown();
                    }
                });

        if(allOrSingle){
            WorkoutTrackerServiceImpl.workout.forEach((s, integer) -> {
                workoutRequestStreamObserver.onNext(WorkoutRequest.newBuilder()
                        .setWorkoutName(s)
                        .setAllOrSingle(true)
                        .build());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }else{
            workoutRequestStreamObserver.onNext(WorkoutRequest.newBuilder()
                    .setWorkoutName(choice)
                    .setAllOrSingle(false)
                    .build());
        }
        workoutRequestStreamObserver.onCompleted();

        try {
            countDownLatch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
