package clients;
import java.util.Scanner;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartFridgeService.smartFridgeServiceGrpc;
import smartFridgeService.*;

public class SmartFridgeServiceCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052)
                .usePlaintext()
                .build();

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("1. Product Stock Checker");
        System.out.println("2. Full Stock Checker");

        System.out.print("Enter choice:");
        String choice = scannerInput.nextLine();	

        if(choice.equalsIgnoreCase("1")){
            System.out.print("Enter Product: ");
            String product = scannerInput.nextLine();
        
        ProductResponse response = smartFridgeServiceGrpc.newBlockingStub(channel)
                .productStockChecker(ProductRequest.newBuilder()
                        .setProduct(product)
                        .build());

        System.out.println("There is " + response.getStockStatus() + " " +
                response.getProduct() + " in the stock.");

    }else if(choice.equalsIgnoreCase("2")){
        smartFridgeServiceGrpc.newBlockingStub(channel)
                .fullStockChecker(ProductRequestNoParam.newBuilder().build())
                .forEachRemaining(productResponse -> {
                    System.out.println(productResponse.getProduct() + " : " +
                            productResponse.getStockStatus());
                });
    }else{
        System.out.println("Invalid Choice");
    }        
	}

}
