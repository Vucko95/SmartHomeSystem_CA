package servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.GymRoomServiceDiscovery;
import jmDNS.GymRoomServiceRegistration;
import gymRoomControlService.GymRoomProtoServiceImpl;

import java.io.IOException;


public class Server_GymRoom {
   

    public static void main(String[] args)  {
//        final Server server = ServerBuilder.forPort(50051)
//                .addService(new GymRoomProtoServiceImpl())
//                .build();
//        server.start();
//        System.out.println("Server Started");
//
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("Server shutting down");
//            server.shutdown();
//            System.out.println("Server closed");
//        }));
//      server.awaitTermination();       
         // jmDNS
        
        int port = 50051;
        String service_clientstreaming = "_grpc._tcp.local.";
        String service_name = "GymRoomServer";
        GymRoomServiceRegistration ssr = new GymRoomServiceRegistration();
        ssr.run(port, service_clientstreaming, service_name);
        
		//Server Creation
		try {
			System.out.println("Starting GymRoom Server...");
			Server server = ServerBuilder.forPort(50051).addService(new GymRoomProtoServiceImpl()).build();
			server.start();
			System.out.println("GymRoom Server started!");
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println("Error starting GymRoom Server! "+e.getMessage());
		}	


    }
}
