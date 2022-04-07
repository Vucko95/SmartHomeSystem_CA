package servers;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.WorkoutTrackerRegistration;
import workoutTrackerService.WorkoutTrackerServiceImpl;

public class Server_WorkoutTracker {
 
	  public static void main(String[] args)  {

    int port = 50053;
    String workoutTracker_service = "_grpc._tcp.local.";
    String service_name = "WorkoutTrackerServer";
    WorkoutTrackerRegistration wtr = new WorkoutTrackerRegistration();
    wtr.run(port, workoutTracker_service, service_name);
    
	//Server Creation
	try {
		System.out.println("Starting WorkoutTracker Server...");
		Server server = ServerBuilder.forPort(50053).addService(new WorkoutTrackerServiceImpl()).build();
		server.start();
		System.out.println("WorkoutTracker Server started!");
		server.awaitTermination();
	} catch (Exception e) {
		System.out.println("Error starting WorkoutTracker Server! "+e.getMessage());
	}	


}
    
    
}// class
