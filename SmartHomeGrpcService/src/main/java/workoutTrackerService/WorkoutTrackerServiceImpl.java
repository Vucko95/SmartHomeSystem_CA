package workoutTrackerService;

import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class WorkoutTrackerServiceImpl extends WorkoutTrackerServiceGrpc.WorkoutTrackerServiceImplBase {


    public static Map<String,Integer> workout = new HashMap<>();
    // Tradmill  App Setup
    static {
        workout.put("Walking",200);
        workout.put("Running",350);
        workout.put("Stairclimb",250);
        workout.put("Cycling",300);
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
