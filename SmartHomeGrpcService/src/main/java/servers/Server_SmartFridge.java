package servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import smartFridgeService.SmartFridgeProtoServiceImpl;

import java.io.IOException;

public class Server_SmartFridge {
 

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = ServerBuilder.forPort(50052)
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
