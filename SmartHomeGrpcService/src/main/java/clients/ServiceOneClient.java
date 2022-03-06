package clients;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import gymRoomControlService.TempRequest;
import gymRoomControlService.TempResponse;
import gymRoomControlService.gymRoomControlServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceOneClient {
	// creating a message
	public static TempRequest inputRequestDataScanner(Scanner scanner) {
		int number = scanner.nextInt();
		TempRequest request = TempRequest.newBuilder().setTempInput(number).build();
		return request;
		
	}
	public static void main(String[] args) throws InterruptedException {
	// create channel
	int port = 50051;
	String host = "localhost";
	ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();	
		// stub creation
		// specific to service
	gymRoomControlServiceGrpc.gymRoomControlServiceStub stub = gymRoomControlServiceGrpc.newStub(channel);
	
	//     / we call RPC
	StreamObserver<TempRequest> requestObserver = stub.changeRoomTemp(new StreamObserver<TempResponse>()
			{
		@Override
		public void onNext(TempResponse response) {	
			System.out.println(response.getTempOutput());
			}

		@Override
		public void onError(Throwable t) {				
				
			}

		@Override
		public void onCompleted() {				
								
			}
		
		});
	
		Scanner scanner = new Scanner(System.in);
		TempRequest request = inputRequestDataScanner(scanner);
//		System.out.println("Input another ");
//		String answer = scanner.next();
		System.out.println("Thank you for inputing temperature");
//		System.out.println("Temeprature set to" + TempOutput);
		scanner.close();
		requestObserver.onCompleted();
		channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS);	
	
	}//main
}//class
