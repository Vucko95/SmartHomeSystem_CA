package servers;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import workoutTrackerService.WorkoutTrackerServiceImpl;

public class Server_WorkoutTracker {
 

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = ServerBuilder.forPort(50053)
                .addService(new WorkoutTrackerServiceImpl())
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
