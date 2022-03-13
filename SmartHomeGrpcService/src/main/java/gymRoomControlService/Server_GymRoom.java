package gymRoomControlService;

import gymRoomControlService.GymRoomProtoServiceImpl;
import io.grpc.ServerBuilder;


import java.io.IOException;

public class Server_GymRoom {
   

    public static void main(String[] args) throws IOException, InterruptedException {
        var server = ServerBuilder.forPort(50051)
                .addService(new GymRoomProtoServiceImpl())
                .build();

        server.start();
        

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            
            server.shutdown();
         
        }));

        server.awaitTermination();
    }
}
