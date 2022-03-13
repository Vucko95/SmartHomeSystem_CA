package smartFridgeService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartFridgeService.ProductRequest;
import smartFridgeService.ProductRequestNoParam;
import smartFridgeService.ProductResponse;
import smartFridgeService.SmartFridgeServiceGrpc;

import java.util.Scanner;

public class SmartFridgeServiceCLI {


    public static void main(String[] args) throws InterruptedException  {
        ManagedChannel manageService = ManagedChannelBuilder.forAddress("localhost",50052)
                .usePlaintext()
                .build();

        Scanner myObj = new Scanner(System.in);

        System.out.println("1. Product Stock Checker");
        System.out.println("2. Full Stock Checker");

        System.out.print("Enter choice:");
        String choice = myObj.nextLine();

        if(choice.equalsIgnoreCase("1")){
            System.out.print("Enter Product: ");
            String product = myObj.nextLine();

            ProductResponse response = SmartFridgeServiceGrpc.newBlockingStub(manageService)
                    .productStockChecker(ProductRequest.newBuilder()
                            .setProduct(product)
                            .build());

            System.out.println("There is " + response.getStockStatus() + " " +
                    response.getProduct() + " in the stock.");

        }else if(choice.equalsIgnoreCase("2")){
            SmartFridgeServiceGrpc.newBlockingStub(manageService)
                    .fullStockChecker(ProductRequestNoParam.newBuilder().build())
                    .forEachRemaining(productResponse -> {
                        System.out.println(productResponse.getProduct() + " : " +
                                productResponse.getStockStatus());
                    });
        }else{
            System.out.println("Invalid Choice");
        }
//        manageService.awaitTermination(100, null);
//        manageService.shutdown();
    }
}
