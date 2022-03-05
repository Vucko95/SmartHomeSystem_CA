package gymRoomControlService;

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

import io.grpc.stub.StreamObserver;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: gymRoomControlService.proto")
public final class gymRoomControlServiceGrpc {

  private gymRoomControlServiceGrpc() {}

  public static final String SERVICE_NAME = "gymRoomControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gymRoomControlService.TempRequest,
      gymRoomControlService.TempResponse> getChangeRoomTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeRoomTemp",
      requestType = gymRoomControlService.TempRequest.class,
      responseType = gymRoomControlService.TempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<gymRoomControlService.TempRequest,
      gymRoomControlService.TempResponse> getChangeRoomTempMethod() {
    io.grpc.MethodDescriptor<gymRoomControlService.TempRequest, gymRoomControlService.TempResponse> getChangeRoomTempMethod;
    if ((getChangeRoomTempMethod = gymRoomControlServiceGrpc.getChangeRoomTempMethod) == null) {
      synchronized (gymRoomControlServiceGrpc.class) {
        if ((getChangeRoomTempMethod = gymRoomControlServiceGrpc.getChangeRoomTempMethod) == null) {
          gymRoomControlServiceGrpc.getChangeRoomTempMethod = getChangeRoomTempMethod = 
              io.grpc.MethodDescriptor.<gymRoomControlService.TempRequest, gymRoomControlService.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gymRoomControlService", "changeRoomTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gymRoomControlService.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gymRoomControlService.TempResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gymRoomControlServiceMethodDescriptorSupplier("changeRoomTemp"))
                  .build();
          }
        }
     }
     return getChangeRoomTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gymRoomControlService.LightRequest,
      gymRoomControlService.LightResponse> getTurnOnOffLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnOffLights",
      requestType = gymRoomControlService.LightRequest.class,
      responseType = gymRoomControlService.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gymRoomControlService.LightRequest,
      gymRoomControlService.LightResponse> getTurnOnOffLightsMethod() {
    io.grpc.MethodDescriptor<gymRoomControlService.LightRequest, gymRoomControlService.LightResponse> getTurnOnOffLightsMethod;
    if ((getTurnOnOffLightsMethod = gymRoomControlServiceGrpc.getTurnOnOffLightsMethod) == null) {
      synchronized (gymRoomControlServiceGrpc.class) {
        if ((getTurnOnOffLightsMethod = gymRoomControlServiceGrpc.getTurnOnOffLightsMethod) == null) {
          gymRoomControlServiceGrpc.getTurnOnOffLightsMethod = getTurnOnOffLightsMethod = 
              io.grpc.MethodDescriptor.<gymRoomControlService.LightRequest, gymRoomControlService.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gymRoomControlService", "turnOnOffLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gymRoomControlService.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gymRoomControlService.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gymRoomControlServiceMethodDescriptorSupplier("turnOnOffLights"))
                  .build();
          }
        }
     }
     return getTurnOnOffLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gymRoomControlServiceStub newStub(io.grpc.Channel channel) {
    return new gymRoomControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gymRoomControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gymRoomControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gymRoomControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gymRoomControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class gymRoomControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gymRoomControlService.TempRequest> changeRoomTemp(
        io.grpc.stub.StreamObserver<gymRoomControlService.TempResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChangeRoomTempMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void turnOnOffLights(gymRoomControlService.LightRequest request,
        io.grpc.stub.StreamObserver<gymRoomControlService.LightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnOffLightsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChangeRoomTempMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                gymRoomControlService.TempRequest,
                gymRoomControlService.TempResponse>(
                  this, METHODID_CHANGE_ROOM_TEMP)))
          .addMethod(
            getTurnOnOffLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gymRoomControlService.LightRequest,
                gymRoomControlService.LightResponse>(
                  this, METHODID_TURN_ON_OFF_LIGHTS)))
          .build();
    }

	public void changeRoomTemp(TempRequest request, StreamObserver<TempResponse> responseObserver) {
		// TODO Auto-generated method stub
		
	}

	public void ChangeRoomTemp(TempRequest request, StreamObserver<TempResponse> responseObserver) {
		// TODO Auto-generated method stub
		
	}
  }

  /**
   */
  public static final class gymRoomControlServiceStub extends io.grpc.stub.AbstractStub<gymRoomControlServiceStub> {
    private gymRoomControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gymRoomControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gymRoomControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gymRoomControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gymRoomControlService.TempRequest> changeRoomTemp(
        io.grpc.stub.StreamObserver<gymRoomControlService.TempResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChangeRoomTempMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void turnOnOffLights(gymRoomControlService.LightRequest request,
        io.grpc.stub.StreamObserver<gymRoomControlService.LightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnOffLightsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gymRoomControlServiceBlockingStub extends io.grpc.stub.AbstractStub<gymRoomControlServiceBlockingStub> {
    private gymRoomControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gymRoomControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gymRoomControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gymRoomControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public gymRoomControlService.LightResponse turnOnOffLights(gymRoomControlService.LightRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnOffLightsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gymRoomControlServiceFutureStub extends io.grpc.stub.AbstractStub<gymRoomControlServiceFutureStub> {
    private gymRoomControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gymRoomControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gymRoomControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gymRoomControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gymRoomControlService.LightResponse> turnOnOffLights(
        gymRoomControlService.LightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnOffLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_OFF_LIGHTS = 0;
  private static final int METHODID_CHANGE_ROOM_TEMP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gymRoomControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gymRoomControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_OFF_LIGHTS:
          serviceImpl.turnOnOffLights((gymRoomControlService.LightRequest) request,
              (io.grpc.stub.StreamObserver<gymRoomControlService.LightResponse>) responseObserver);
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
        case METHODID_CHANGE_ROOM_TEMP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.changeRoomTemp(
              (io.grpc.stub.StreamObserver<gymRoomControlService.TempResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class gymRoomControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gymRoomControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gymRoomControlService.GymRoomControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gymRoomControlService");
    }
  }

  private static final class gymRoomControlServiceFileDescriptorSupplier
      extends gymRoomControlServiceBaseDescriptorSupplier {
    gymRoomControlServiceFileDescriptorSupplier() {}
  }

  private static final class gymRoomControlServiceMethodDescriptorSupplier
      extends gymRoomControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gymRoomControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (gymRoomControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gymRoomControlServiceFileDescriptorSupplier())
              .addMethod(getChangeRoomTempMethod())
              .addMethod(getTurnOnOffLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
