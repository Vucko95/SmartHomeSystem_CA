package clients;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class GymRoomControlCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
	                .usePlaintext()
	                .build();
	       Scanner scannerInput = new Scanner(System.in);

	        System.out.println("1. Turn Lights On/Off");
	        System.out.println("2. Change Room Temperature");
	        System.out.print("Enter choice:");
	        String choice = scannerInput.nextLine();
	}

}
