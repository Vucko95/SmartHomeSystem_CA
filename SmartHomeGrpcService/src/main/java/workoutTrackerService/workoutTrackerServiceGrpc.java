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
public final class workoutTrackerServiceGrpc {

  private workoutTrackerServiceGrpc() {}

  public static final String SERVICE_NAME = "workoutTrackerService";

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
    if ((getCalorieBurnerMethod = workoutTrackerServiceGrpc.getCalorieBurnerMethod) == null) {
      synchronized (workoutTrackerServiceGrpc.class) {
        if ((getCalorieBurnerMethod = workoutTrackerServiceGrpc.getCalorieBurnerMethod) == null) {
          workoutTrackerServiceGrpc.getCalorieBurnerMethod = getCalorieBurnerMethod = 
              io.grpc.MethodDescriptor.<workoutTrackerService.WorkoutDetailRequest, workoutTrackerService.WorkoutDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "workoutTrackerService", "calorieBurner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.WorkoutDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.WorkoutDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new workoutTrackerServiceMethodDescriptorSupplier("calorieBurner"))
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
    if ((getFoodIntakeCounterMethod = workoutTrackerServiceGrpc.getFoodIntakeCounterMethod) == null) {
      synchronized (workoutTrackerServiceGrpc.class) {
        if ((getFoodIntakeCounterMethod = workoutTrackerServiceGrpc.getFoodIntakeCounterMethod) == null) {
          workoutTrackerServiceGrpc.getFoodIntakeCounterMethod = getFoodIntakeCounterMethod = 
              io.grpc.MethodDescriptor.<workoutTrackerService.MealRequest, workoutTrackerService.MealCaloriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "workoutTrackerService", "foodIntakeCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.MealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  workoutTrackerService.MealCaloriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new workoutTrackerServiceMethodDescriptorSupplier("foodIntakeCounter"))
                  .build();
          }
        }
     }
     return getFoodIntakeCounterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static workoutTrackerServiceStub newStub(io.grpc.Channel channel) {
    return new workoutTrackerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static workoutTrackerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new workoutTrackerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static workoutTrackerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new workoutTrackerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class workoutTrackerServiceImplBase implements io.grpc.BindableService {

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
  public static final class workoutTrackerServiceStub extends io.grpc.stub.AbstractStub<workoutTrackerServiceStub> {
    private workoutTrackerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private workoutTrackerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected workoutTrackerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new workoutTrackerServiceStub(channel, callOptions);
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
  public static final class workoutTrackerServiceBlockingStub extends io.grpc.stub.AbstractStub<workoutTrackerServiceBlockingStub> {
    private workoutTrackerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private workoutTrackerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected workoutTrackerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new workoutTrackerServiceBlockingStub(channel, callOptions);
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
  public static final class workoutTrackerServiceFutureStub extends io.grpc.stub.AbstractStub<workoutTrackerServiceFutureStub> {
    private workoutTrackerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private workoutTrackerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected workoutTrackerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new workoutTrackerServiceFutureStub(channel, callOptions);
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
    private final workoutTrackerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(workoutTrackerServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class workoutTrackerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    workoutTrackerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return workoutTrackerService.WorkoutTrackerServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("workoutTrackerService");
    }
  }

  private static final class workoutTrackerServiceFileDescriptorSupplier
      extends workoutTrackerServiceBaseDescriptorSupplier {
    workoutTrackerServiceFileDescriptorSupplier() {}
  }

  private static final class workoutTrackerServiceMethodDescriptorSupplier
      extends workoutTrackerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    workoutTrackerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (workoutTrackerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new workoutTrackerServiceFileDescriptorSupplier())
              .addMethod(getCalorieBurnerMethod())
              .addMethod(getFoodIntakeCounterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
