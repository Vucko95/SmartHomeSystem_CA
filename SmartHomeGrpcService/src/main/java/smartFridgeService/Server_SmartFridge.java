package smartFridgeService;

import smartFridgeService.SmartFridgeProtoServiceImpl;

import java.io.IOException;

import io.grpc.ServerBuilder;

public class Server_SmartFridge {
 

    public static void main(String[] args) throws IOException, InterruptedException {
        var server = ServerBuilder.forPort(50052)
                .addService(new SmartFridgeProtoServiceImpl())
                .build();

        server.start();
        System.out.println("Server Started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Server shutting down");
            server.shutdown();
            System.out.println("Server closed");
        }));

        server.awaitTermination();
    }
    
    
    
}// class
