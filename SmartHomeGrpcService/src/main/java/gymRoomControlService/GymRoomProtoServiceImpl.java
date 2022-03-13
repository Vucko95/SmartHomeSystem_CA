package gymRoomControlService;

import io.grpc.stub.StreamObserver;

public class GymRoomProtoServiceImpl extends GymRoomServiceGrpc.GymRoomServiceImplBase {

    @Override
    public void turnOnOffLights(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        var turnLightRequest = request.getTurnLightRequest();
        responseObserver.onNext(LightResponse.newBuilder()
                .setTurnLightResponse(turnLightRequest)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<TempRequest> changeRoomTemp(StreamObserver<TempResponse> responseObserver) {
        var requestObserver = new StreamObserver<TempRequest>() {
            int temperature;

            @Override
            public void onNext(TempRequest tempRequest) {
                this.temperature = tempRequest.getTempInput();
            }

            @Override
            public void onError(Throwable throwable) {}

            @Override
            public void onCompleted() {
                responseObserver.onNext(TempResponse.newBuilder()
                        .setTempOutput(temperature)
                        .build());
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
}
