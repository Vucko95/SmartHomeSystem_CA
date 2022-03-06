package clients;

import gymRoomControlService.TempRequest;
import gymRoomControlService.TempResponse;
import gymRoomControlService.gymRoomControlServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceOneClient {
	public static void main(String[] args) {
	// create channel
	int port = 50051;
	String host = "localhost";
	
	ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();	
		
	gymRoomControlServiceGrpc.gymRoomControlServiceStub stub = gymRoomControlServiceGrpc.newStub(channel);
	
	StreamObserver<TempRequest> requestObserver = stub.changeRoomTemp(new StreamObserver<TempResponse>()
			{
		@Override
		public void onNext(TempResponse response) {	
			System.out.println("Test");
			}

		@Override
		public void onError(Throwable t) {				
				
			}

		@Override
		public void onCompleted() {				
								
			}
		
		});
	
	
	
	
	
	}//main
}//class
