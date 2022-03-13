package gymRoomControlService;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GymRoomControlCLI {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("1. Turn Lights On/Off");
        System.out.println("2. Change Room Temperature");

        System.out.print("Enter choice:");
        String choice = scannerInput.nextLine();

        if (choice.equalsIgnoreCase("1")) {
            System.out.print("1. Turn Lights on or off : ");
            String onOff = scannerInput.nextLine();
            var lightRequest = onOff.equalsIgnoreCase("off") ? LightStatus.off : LightStatus.on;
            var gymRoomServiceBlockingStub = GymRoomServiceGrpc.newBlockingStub(channel)
                    .turnOnOffLights(LightRequest.newBuilder()
                            .setTurnLightRequest(lightRequest)
                            .build());

            System.out.println("Lights are now " + gymRoomServiceBlockingStub.getTurnLightResponse().name());

        } else if (choice.equalsIgnoreCase("2")) {
            System.out.print("Enter temperature: ");
            String temp = scannerInput.nextLine();
            // temperature
            var gymRoomServiceStub = GymRoomServiceGrpc.newStub(channel);
            var latch = new CountDownLatch(1);
            var req = gymRoomServiceStub.changeRoomTemp(new StreamObserver<>() {
                int temp;

                
                @Override
                public void onNext(TempResponse tempResponse) {
                    temp = tempResponse.getTempOutput();
                }

                @Override
                public void onError(Throwable throwable) {
                    latch.countDown();
                }

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
                latch.await(1L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
