package workoutTrackerService;

import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class WorkoutTrackerServiceImpl extends WorkoutTrackerServiceGrpc.WorkoutTrackerServiceImplBase {


    public static Map<String,Integer> workout = new HashMap<>();

    static {
        workout.put("Running",300);
        workout.put("Hiking",350);
        workout.put("Weights",250);
        workout.put("Swimming",400);
    }

    @Override
    public StreamObserver<WorkoutRequest> workoutList(StreamObserver<WorkoutResponse> responseObserver) {
        final StreamObserver<WorkoutRequest> streamObserver = new StreamObserver<WorkoutRequest>() {
            @Override
            public void onNext(WorkoutRequest value) {
                final String workoutName = value.getWorkoutName();
                responseObserver.onNext(WorkoutResponse.newBuilder()
                        .setWorkoutName(workoutName)
                        .setCalorieAmount(workout.get(workoutName))
                        .build());
            }

            @Override
            public void onError(Throwable t) { }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return streamObserver;
    }
}
