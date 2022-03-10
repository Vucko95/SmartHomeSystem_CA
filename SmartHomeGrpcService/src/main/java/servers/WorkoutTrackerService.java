package servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import workoutTrackerService.WorkoutTrackerServiceImpl;
import workoutTrackerService.workoutTrackerServiceGrpc.workoutTrackerServiceImplBase;


import java.io.IOException;


public class WorkoutTrackerService {
	private Server server;
    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	System.out.println("Starting Smart Workout Tracker");
    	final WorkoutTrackerService ourServer = new WorkoutTrackerService();
    	ourServer.start();
    }
    
	private void start() throws IOException, InterruptedException {

		System.out.println("Starting Smart Server");
		
		int port = 50053;
		

		
		server = ServerBuilder.forPort(port).addService(new WorkoutTrackerServiceImpl()).build().start();
		
		System.out.println("Server Running on Port: " + port);
		
		server.awaitTermination();
	}
	
	
	
	static class WorkoutTrackerServiceImpl extends workoutTrackerServiceImplBase {
		
	}
	
	
}