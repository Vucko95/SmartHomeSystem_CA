package clients;

import gymRoomControlService.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GymRoomControlCLI {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        ManagedChannel manageService = ManagedChannelBuilder.forAddress("localhost",50051) //50051 is the port for GymRoomServer
                .usePlaintext()
                .build();

        //lets add the input questions
        Scanner myObj = new Scanner(System.in);

        System.out.println("1. Turn Lights On/Off");
        System.out.println("2. Change Room Temperature");

        System.out.print("Enter choice:");
        String choice = myObj.nextLine();

        if(choice.equalsIgnoreCase("1")){
            //the selected option is turn off/on the lights
            System.out.print("1. Turn Lights on or off : ");
            String onOff = myObj.nextLine();
            LightStatus lightRequest = onOff.equalsIgnoreCase("off")  ? LightStatus.off:LightStatus.on;
            LightResponse gymRoomServiceBlockingStub = GymRoomServiceGrpc.newBlockingStub(manageService)
                    .turnOnOffLights(LightRequest.newBuilder()
                            .setTurnLightRequest(lightRequest)
                            .build());
            System.out.println("Lights are now " + gymRoomServiceBlockingStub.getTurnLightResponse().name());
        }else if(choice.equalsIgnoreCase("2")){
            //selected change the temperature
            System.out.print("Enter temperature: ");
            String temp = myObj.nextLine();
            //temperature
            GymRoomServiceGrpc.GymRoomServiceStub gymRoomServiceStub = GymRoomServiceGrpc.newStub(manageService);
            CountDownLatch latch = new CountDownLatch(1);
            StreamObserver req = gymRoomServiceStub.changeRoomTemp(new StreamObserver<TempResponse>() {
                int temp;
                @Override
                public void onNext(TempResponse tempResponse) {
                    temp = tempResponse.getTempOutput();
                }
                @Override
                public void onError(Throwable throwable) {latch.countDown();}

                @Override
                public void onCompleted() {
                    latch.countDown();
                }
            });

            try {
                req.onNext(TempRequest.newBuilder()
                        .setTempInput(Integer.parseInt(temp))
                        .build());
                req.onCompleted();
                System.out.println("Desired Temperature is set to : " + temp);
                latch.await(1L, TimeUnit.MILLISECONDS); // always need a delay of atleast 1 miliseconds
            } catch (InterruptedException | NumberFormatException e) {
                e.printStackTrace();
            }
        }else{
            //just in case the selected is out of range
            System.out.println("Invalid Choice");
        }




        
    }
}
