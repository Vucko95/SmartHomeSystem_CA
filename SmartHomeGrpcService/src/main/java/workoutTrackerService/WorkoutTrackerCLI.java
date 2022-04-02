package workoutTrackerService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WorkoutTrackerCLI {
    public static void main(String[] args) {
        ManagedChannel manageService = ManagedChannelBuilder.forAddress("localhost",50053)
                .usePlaintext()
                .build();

        Scanner myObj = new Scanner(System.in);
        System.out.print("Please input name of Workout you would like to check");
        String choice = myObj.nextLine();

        System.out.print("Is this all you would like to check (y/n)");
        String yn = myObj.nextLine();

        if(yn.equalsIgnoreCase("y")){
            // *** if yes print only this one
            sendRequest(manageService,choice,false);
        }else{
            System.out.print("Would you like to print all (y/n)");
            String isAll = myObj.nextLine();
            if(isAll.equalsIgnoreCase("n")){
                //** IF no then print only one from before
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
