package servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.SimpleServiceRegistration;
import jmDNS.SmartFridgeRegistration;
import smartFridgeService.SmartFridgeProtoServiceImpl;

import java.io.IOException;

import gymRoomControlService.GymRoomProtoServiceImpl;

public class Server_SmartFridge {
 

    public static void main(String[] args)  {
//        final Server server = ServerBuilder.forPort(50052)
//                .addService(new SmartFridgeProtoServiceImpl())
//                .build();
//
//        server.start();
//        System.out.println("Server Started");
//
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("Server shutting down");
//            server.shutdown();
//            System.out.println("Server closed");
//        }));
//
//        server.awaitTermination();
//    }// main
        int port = 50052;
        String SmartFridge_service = "_grpc._tcp.local.";
        String service_name = "SmartFridgeServer";
        SmartFridgeRegistration sfr = new SmartFridgeRegistration();
        sfr.run(port, SmartFridge_service, service_name);
        
		//Server Creation
		try {
			System.out.println("Starting Smart Fridge Server...");
			Server server = ServerBuilder.forPort(50052).addService(new SmartFridgeProtoServiceImpl()).build();
			server.start();
			System.out.println("Smart Fridge Server started!");
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println("Error starting Smart Fridge Server! "+e.getMessage());
		}	


    }
    
    
}// class
