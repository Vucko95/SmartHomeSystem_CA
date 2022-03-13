package smartFridgeService;

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
    comments = "Source: smartFridgeService.proto")
public final class SmartFridgeServiceGrpc {

  private SmartFridgeServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartFridgeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartFridgeService.ProductRequest,
      smartFridgeService.ProductResponse> getProductStockCheckerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "productStockChecker",
      requestType = smartFridgeService.ProductRequest.class,
      responseType = smartFridgeService.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartFridgeService.ProductRequest,
      smartFridgeService.ProductResponse> getProductStockCheckerMethod() {
    io.grpc.MethodDescriptor<smartFridgeService.ProductRequest, smartFridgeService.ProductResponse> getProductStockCheckerMethod;
    if ((getProductStockCheckerMethod = SmartFridgeServiceGrpc.getProductStockCheckerMethod) == null) {
      synchronized (SmartFridgeServiceGrpc.class) {
        if ((getProductStockCheckerMethod = SmartFridgeServiceGrpc.getProductStockCheckerMethod) == null) {
          SmartFridgeServiceGrpc.getProductStockCheckerMethod = getProductStockCheckerMethod = 
              io.grpc.MethodDescriptor.<smartFridgeService.ProductRequest, smartFridgeService.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFridgeService", "productStockChecker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartFridgeService.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartFridgeService.ProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFridgeServiceMethodDescriptorSupplier("productStockChecker"))
                  .build();
          }
        }
     }
     return getProductStockCheckerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartFridgeService.ProductRequestNoParam,
      smartFridgeService.ProductResponse> getFullStockCheckerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStockChecker",
      requestType = smartFridgeService.ProductRequestNoParam.class,
      responseType = smartFridgeService.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smartFridgeService.ProductRequestNoParam,
      smartFridgeService.ProductResponse> getFullStockCheckerMethod() {
    io.grpc.MethodDescriptor<smartFridgeService.ProductRequestNoParam, smartFridgeService.ProductResponse> getFullStockCheckerMethod;
    if ((getFullStockCheckerMethod = SmartFridgeServiceGrpc.getFullStockCheckerMethod) == null) {
      synchronized (SmartFridgeServiceGrpc.class) {
        if ((getFullStockCheckerMethod = SmartFridgeServiceGrpc.getFullStockCheckerMethod) == null) {
          SmartFridgeServiceGrpc.getFullStockCheckerMethod = getFullStockCheckerMethod = 
              io.grpc.MethodDescriptor.<smartFridgeService.ProductRequestNoParam, smartFridgeService.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFridgeService", "fullStockChecker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartFridgeService.ProductRequestNoParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartFridgeService.ProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFridgeServiceMethodDescriptorSupplier("fullStockChecker"))
                  .build();
          }
        }
     }
     return getFullStockCheckerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartFridgeServiceStub newStub(io.grpc.Channel channel) {
    return new SmartFridgeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartFridgeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartFridgeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartFridgeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartFridgeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartFridgeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void productStockChecker(smartFridgeService.ProductRequest request,
        io.grpc.stub.StreamObserver<smartFridgeService.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProductStockCheckerMethod(), responseObserver);
    }

    /**
     */
    public void fullStockChecker(smartFridgeService.ProductRequestNoParam request,
        io.grpc.stub.StreamObserver<smartFridgeService.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFullStockCheckerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProductStockCheckerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartFridgeService.ProductRequest,
                smartFridgeService.ProductResponse>(
                  this, METHODID_PRODUCT_STOCK_CHECKER)))
          .addMethod(
            getFullStockCheckerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                smartFridgeService.ProductRequestNoParam,
                smartFridgeService.ProductResponse>(
                  this, METHODID_FULL_STOCK_CHECKER)))
          .build();
    }
  }

  /**
   */
  public static final class SmartFridgeServiceStub extends io.grpc.stub.AbstractStub<SmartFridgeServiceStub> {
    private SmartFridgeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFridgeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFridgeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFridgeServiceStub(channel, callOptions);
    }

    /**
     */
    public void productStockChecker(smartFridgeService.ProductRequest request,
        io.grpc.stub.StreamObserver<smartFridgeService.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProductStockCheckerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fullStockChecker(smartFridgeService.ProductRequestNoParam request,
        io.grpc.stub.StreamObserver<smartFridgeService.ProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFullStockCheckerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartFridgeServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartFridgeServiceBlockingStub> {
    private SmartFridgeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFridgeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFridgeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFridgeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartFridgeService.ProductResponse productStockChecker(smartFridgeService.ProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getProductStockCheckerMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<smartFridgeService.ProductResponse> fullStockChecker(
        smartFridgeService.ProductRequestNoParam request) {
      return blockingServerStreamingCall(
          getChannel(), getFullStockCheckerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartFridgeServiceFutureStub extends io.grpc.stub.AbstractStub<SmartFridgeServiceFutureStub> {
    private SmartFridgeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFridgeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFridgeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFridgeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartFridgeService.ProductResponse> productStockChecker(
        smartFridgeService.ProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProductStockCheckerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCT_STOCK_CHECKER = 0;
  private static final int METHODID_FULL_STOCK_CHECKER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartFridgeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartFridgeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCT_STOCK_CHECKER:
          serviceImpl.productStockChecker((smartFridgeService.ProductRequest) request,
              (io.grpc.stub.StreamObserver<smartFridgeService.ProductResponse>) responseObserver);
          break;
        case METHODID_FULL_STOCK_CHECKER:
          serviceImpl.fullStockChecker((smartFridgeService.ProductRequestNoParam) request,
              (io.grpc.stub.StreamObserver<smartFridgeService.ProductResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartFridgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartFridgeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartFridgeService.SmartFridgeProtoService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartFridgeService");
    }
  }

  private static final class SmartFridgeServiceFileDescriptorSupplier
      extends SmartFridgeServiceBaseDescriptorSupplier {
    SmartFridgeServiceFileDescriptorSupplier() {}
  }

  private static final class SmartFridgeServiceMethodDescriptorSupplier
      extends SmartFridgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartFridgeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartFridgeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartFridgeServiceFileDescriptorSupplier())
              .addMethod(getProductStockCheckerMethod())
              .addMethod(getFullStockCheckerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
