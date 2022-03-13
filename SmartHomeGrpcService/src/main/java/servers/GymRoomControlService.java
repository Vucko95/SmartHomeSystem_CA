package servers;


import io.grpc.Server;
import io.grpc.ServerBuilder;


import java.io.IOException;

import gymRoomControlService.GymRoomProtoServiceImpl;

public class GymRoomControlService {
    

    public static void main(String[] args) throws IOException, InterruptedException {
         Server server = ServerBuilder.forPort(50051)
                .addService(new GymRoomProtoServiceImpl())
                .build();

        server.start();
  

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        
            server.shutdown();
      
        }));

        server.awaitTermination();
    }
}
