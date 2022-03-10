package servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import smartFridgeService.SmartFridgeServiceImpl;
import smartFridgeService.smartFridgeServiceGrpc.smartFridgeServiceImplBase;

import java.io.IOException;
public class SmartFridgeService {
	private Server server;
    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	System.out.println("Starting Smart Fridge");
    	final SmartFridgeService ourServer = new SmartFridgeService();
    	ourServer.start();
    }
    
	private void start() throws IOException, InterruptedException {

		System.out.println("Starting Smart Server");
		
		int port = 50052;
		

		
		server = ServerBuilder.forPort(port).addService(new SmartFridgeServiceImpl()).build().start();
		
		System.out.println("Server Running on Port: " + port);
		
		server.awaitTermination();
	}
	
	
	
	static class SmartFridgeServiceImpl extends smartFridgeServiceImplBase {
		
	}
	
	
	
	
}//end