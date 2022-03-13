package workoutTrackerService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: workoutTrackerService.proto")
public final class WorkoutTrackerServiceGrpc {

  private WorkoutTrackerServiceGrpc() {}

  public static final String SERVICE_NAME = "WorkoutTrackerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<workoutTrackerService.WorkoutDetailRequest,
      workoutTrackerService.WorkoutDetailResponse> getCalorieBurnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calorieBurner",
      requestType = workoutTrackerService.WorkoutDetailRequest.class,
      responseType = workoutTrackerService.WorkoutDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<workoutTrackerService.WorkoutDetailRequest,
      workoutTrackerService.WorkoutDetailResponse> getCalorieBurnerMethod() {
    io.grpc.MethodDescriptor<workoutTrackerService.WorkoutDetailRequest, workoutTrackerService.WorkoutDetailResponse> getCalorieBurnerMethod;
    if ((getCalorieBurnerMethod = WorkoutTrackerServiceGrpc.getCalorieBurnerMethod) == null) {
      synchronized (WorkoutTrackerServiceGrpc.class) {
        if ((getCalorieBurnerMethod = WorkoutTrackerServiceGrpc.getCalorieBurnerMethod) == null) {
          WorkoutTrackerServiceGrpc.getCalorieBurnerMethod = getCalorieBurnerMethod = 
              io.grpc.MethodDescriptor.<workoutTrackerService.WorkoutDetailRequest, workoutTrackerService.WorkoutDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "WorkoutTrackerService", "calorieBurner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.WorkoutDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.WorkoutDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkoutTrackerServiceMethodDescriptorSupplier("calorieBurner"))
                  .build();
          }
        }
     }
     return getCalorieBurnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<workoutTrackerService.MealRequest,
      workoutTrackerService.MealCaloriesResponse> getFoodIntakeCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "foodIntakeCounter",
      requestType = workoutTrackerService.MealRequest.class,
      responseType = workoutTrackerService.MealCaloriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<workoutTrackerService.MealRequest,
      workoutTrackerService.MealCaloriesResponse> getFoodIntakeCounterMethod() {
    io.grpc.MethodDescriptor<workoutTrackerService.MealRequest, workoutTrackerService.MealCaloriesResponse> getFoodIntakeCounterMethod;
    if ((getFoodIntakeCounterMethod = WorkoutTrackerServiceGrpc.getFoodIntakeCounterMethod) == null) {
      synchronized (WorkoutTrackerServiceGrpc.class) {
        if ((getFoodIntakeCounterMethod = WorkoutTrackerServiceGrpc.getFoodIntakeCounterMethod) == null) {
          WorkoutTrackerServiceGrpc.getFoodIntakeCounterMethod = getFoodIntakeCounterMethod = 
              io.grpc.MethodDescriptor.<workoutTrackerService.MealRequest, workoutTrackerService.MealCaloriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "WorkoutTrackerService", "foodIntakeCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.MealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.MealCaloriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkoutTrackerServiceMethodDescriptorSupplier("foodIntakeCounter"))
                  .build();
          }
        }
     }
     return getFoodIntakeCounterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkoutTrackerServiceStub newStub(io.grpc.Channel channel) {
    return new WorkoutTrackerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkoutTrackerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WorkoutTrackerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkoutTrackerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WorkoutTrackerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WorkoutTrackerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calorieBurner(workoutTrackerService.WorkoutDetailRequest request,
        io.grpc.stub.StreamObserver<workoutTrackerService.WorkoutDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalorieBurnerMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<workoutTrackerService.MealRequest> foodIntakeCounter(
        io.grpc.stub.StreamObserver<workoutTrackerService.MealCaloriesResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFoodIntakeCounterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalorieBurnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                workoutTrackerService.WorkoutDetailRequest,
                workoutTrackerService.WorkoutDetailResponse>(
                  this, METHODID_CALORIE_BURNER)))
          .addMethod(
            getFoodIntakeCounterMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                workoutTrackerService.MealRequest,
                workoutTrackerService.MealCaloriesResponse>(
                  this, METHODID_FOOD_INTAKE_COUNTER)))
          .build();
    }
  }

  /**
   */
  public static final class WorkoutTrackerServiceStub extends io.grpc.stub.AbstractStub<WorkoutTrackerServiceStub> {
    private WorkoutTrackerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkoutTrackerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkoutTrackerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkoutTrackerServiceStub(channel, callOptions);
    }

    /**
     */
    public void calorieBurner(workoutTrackerService.WorkoutDetailRequest request,
        io.grpc.stub.StreamObserver<workoutTrackerService.WorkoutDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalorieBurnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<workoutTrackerService.MealRequest> foodIntakeCounter(
        io.grpc.stub.StreamObserver<workoutTrackerService.MealCaloriesResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFoodIntakeCounterMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WorkoutTrackerServiceBlockingStub extends io.grpc.stub.AbstractStub<WorkoutTrackerServiceBlockingStub> {
    private WorkoutTrackerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkoutTrackerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkoutTrackerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkoutTrackerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public workoutTrackerService.WorkoutDetailResponse calorieBurner(workoutTrackerService.WorkoutDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalorieBurnerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WorkoutTrackerServiceFutureStub extends io.grpc.stub.AbstractStub<WorkoutTrackerServiceFutureStub> {
    private WorkoutTrackerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkoutTrackerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkoutTrackerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkoutTrackerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<workoutTrackerService.WorkoutDetailResponse> calorieBurner(
        workoutTrackerService.WorkoutDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalorieBurnerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALORIE_BURNER = 0;
  private static final int METHODID_FOOD_INTAKE_COUNTER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkoutTrackerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkoutTrackerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALORIE_BURNER:
          serviceImpl.calorieBurner((workoutTrackerService.WorkoutDetailRequest) request,
              (io.grpc.stub.StreamObserver<workoutTrackerService.WorkoutDetailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FOOD_INTAKE_COUNTER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.foodIntakeCounter(
              (io.grpc.stub.StreamObserver<workoutTrackerService.MealCaloriesResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WorkoutTrackerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkoutTrackerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return workoutTrackerService.WorkoutTrackerProtoService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkoutTrackerService");
    }
  }

  private static final class WorkoutTrackerServiceFileDescriptorSupplier
      extends WorkoutTrackerServiceBaseDescriptorSupplier {
    WorkoutTrackerServiceFileDescriptorSupplier() {}
  }

  private static final class WorkoutTrackerServiceMethodDescriptorSupplier
      extends WorkoutTrackerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkoutTrackerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WorkoutTrackerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkoutTrackerServiceFileDescriptorSupplier())
              .addMethod(getCalorieBurnerMethod())
              .addMethod(getFoodIntakeCounterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
