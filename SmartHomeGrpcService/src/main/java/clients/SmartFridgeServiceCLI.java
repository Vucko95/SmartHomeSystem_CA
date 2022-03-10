package clients;
import java.util.Scanner;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartFridgeServiceCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ManagedChannel manageService = ManagedChannelBuilder.forAddress("localhost",50052)
                .usePlaintext()
                .build();

        Scanner myObj = new Scanner(System.in);

        System.out.println("1. Product Stock Checker");
        System.out.println("2. Full Stock Checker");

        System.out.print("Enter choice:");
        String choice = myObj.nextLine();		
	}

}
