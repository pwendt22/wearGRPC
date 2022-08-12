package watchHealth;

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
 * <pre>
 * Smart Watch for Health service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "wearGRPC.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<watchHealth.stepRequest,
      watchHealth.stepResponse> getStepQtyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stepQty",
      requestType = watchHealth.stepRequest.class,
      responseType = watchHealth.stepResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<watchHealth.stepRequest,
      watchHealth.stepResponse> getStepQtyMethod() {
    io.grpc.MethodDescriptor<watchHealth.stepRequest, watchHealth.stepResponse> getStepQtyMethod;
    if ((getStepQtyMethod = Service1Grpc.getStepQtyMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getStepQtyMethod = Service1Grpc.getStepQtyMethod) == null) {
          Service1Grpc.getStepQtyMethod = getStepQtyMethod = 
              io.grpc.MethodDescriptor.<watchHealth.stepRequest, watchHealth.stepResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service1", "stepQty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchHealth.stepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchHealth.stepResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("stepQty"))
                  .build();
          }
        }
     }
     return getStepQtyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<watchHealth.heartBeat,
      watchHealth.avgHeartRate> getHeartRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heartRate",
      requestType = watchHealth.heartBeat.class,
      responseType = watchHealth.avgHeartRate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<watchHealth.heartBeat,
      watchHealth.avgHeartRate> getHeartRateMethod() {
    io.grpc.MethodDescriptor<watchHealth.heartBeat, watchHealth.avgHeartRate> getHeartRateMethod;
    if ((getHeartRateMethod = Service1Grpc.getHeartRateMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getHeartRateMethod = Service1Grpc.getHeartRateMethod) == null) {
          Service1Grpc.getHeartRateMethod = getHeartRateMethod = 
              io.grpc.MethodDescriptor.<watchHealth.heartBeat, watchHealth.avgHeartRate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service1", "heartRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchHealth.heartBeat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchHealth.avgHeartRate.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("heartRate"))
                  .build();
          }
        }
     }
     return getHeartRateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    return new Service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service1FutureStub(channel);
  }

  /**
   * <pre>
   * Smart Watch for Health service definition
   * </pre>
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server stream - counting the steps
     * </pre>
     */
    public void stepQty(watchHealth.stepRequest request,
        io.grpc.stub.StreamObserver<watchHealth.stepResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStepQtyMethod(), responseObserver);
    }

    /**
     * <pre>
     *Heart Rate RPC Client Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<watchHealth.heartBeat> heartRate(
        io.grpc.stub.StreamObserver<watchHealth.avgHeartRate> responseObserver) {
      return asyncUnimplementedStreamingCall(getHeartRateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStepQtyMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                watchHealth.stepRequest,
                watchHealth.stepResponse>(
                  this, METHODID_STEP_QTY)))
          .addMethod(
            getHeartRateMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                watchHealth.heartBeat,
                watchHealth.avgHeartRate>(
                  this, METHODID_HEART_RATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Smart Watch for Health service definition
   * </pre>
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractStub<Service1Stub> {
    private Service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *server stream - counting the steps
     * </pre>
     */
    public void stepQty(watchHealth.stepRequest request,
        io.grpc.stub.StreamObserver<watchHealth.stepResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStepQtyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Heart Rate RPC Client Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<watchHealth.heartBeat> heartRate(
        io.grpc.stub.StreamObserver<watchHealth.avgHeartRate> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHeartRateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Smart Watch for Health service definition
   * </pre>
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractStub<Service1BlockingStub> {
    private Service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server stream - counting the steps
     * </pre>
     */
    public java.util.Iterator<watchHealth.stepResponse> stepQty(
        watchHealth.stepRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStepQtyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Smart Watch for Health service definition
   * </pre>
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractStub<Service1FutureStub> {
    private Service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STEP_QTY = 0;
  private static final int METHODID_HEART_RATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STEP_QTY:
          serviceImpl.stepQty((watchHealth.stepRequest) request,
              (io.grpc.stub.StreamObserver<watchHealth.stepResponse>) responseObserver);
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
        case METHODID_HEART_RATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heartRate(
              (io.grpc.stub.StreamObserver<watchHealth.avgHeartRate>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return watchHealth.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getStepQtyMethod())
              .addMethod(getHeartRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
