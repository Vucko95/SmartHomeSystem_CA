package servers;
import java.io.IOException;
import gymRoomControlService.*;
import gymRoomControlService.GymRoomControlServiceImpl;
import gymRoomControlService.TempRequest;
import gymRoomControlService.TempResponse;
import gymRoomControlService.gymRoomControlServiceGrpc.gymRoomControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceOneServer {
	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		final ServiceOneServer ourServer = new ServiceOneServer();
		ourServer.start();
		
	}

	private void start() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting Server");
		
		int port = 50051;		

		server = ServerBuilder.forPort(port).addService(new GymRoomControlServerImpl()).build().start();
		
		System.out.println("Server Running on Port: " + port);
		
		server.awaitTermination();
	}
	
	// we will abstract base class for implemntation
	
	static class GymRoomControlServerImpl extends gymRoomControlServiceImplBase  {
		@Override
		public StreamObserver<TempRequest> changeRoomTemp(StreamObserver<TempResponse> responseObserver){
			return new StreamObserver<TempRequest>() {

				@Override
				public void onNext(TempRequest value) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					
				}
				
			};
			
			
			
		}
		
		
		
		} 
		
	
	
	
	
	
	
	
	} // end of main


