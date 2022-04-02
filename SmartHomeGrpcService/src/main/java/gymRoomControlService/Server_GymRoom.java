package gymRoomControlService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server_GymRoom {
   

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = ServerBuilder.forPort(50051)
                .addService(new GymRoomProtoServiceImpl())
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
}
