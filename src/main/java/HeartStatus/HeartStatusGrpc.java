package HeartStatus;

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
    comments = "Source: service2.proto")
public final class HeartStatusGrpc {

  private HeartStatusGrpc() {}

  public static final String SERVICE_NAME = "wearGRPC.HeartStatus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HeartStatus.StatusRequest,
      HeartStatus.StatusResponse> getHeartStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HeartStatus",
      requestType = HeartStatus.StatusRequest.class,
      responseType = HeartStatus.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<HeartStatus.StatusRequest,
      HeartStatus.StatusResponse> getHeartStatusMethod() {
    io.grpc.MethodDescriptor<HeartStatus.StatusRequest, HeartStatus.StatusResponse> getHeartStatusMethod;
    if ((getHeartStatusMethod = HeartStatusGrpc.getHeartStatusMethod) == null) {
      synchronized (HeartStatusGrpc.class) {
        if ((getHeartStatusMethod = HeartStatusGrpc.getHeartStatusMethod) == null) {
          HeartStatusGrpc.getHeartStatusMethod = getHeartStatusMethod = 
              io.grpc.MethodDescriptor.<HeartStatus.StatusRequest, HeartStatus.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.HeartStatus", "HeartStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeartStatus.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeartStatus.StatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeartStatusMethodDescriptorSupplier("HeartStatus"))
                  .build();
          }
        }
     }
     return getHeartStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartStatusStub newStub(io.grpc.Channel channel) {
    return new HeartStatusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartStatusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeartStatusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartStatusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeartStatusFutureStub(channel);
  }

  /**
   */
  public static abstract class HeartStatusImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Bi-directional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<HeartStatus.StatusRequest> heartStatus(
        io.grpc.stub.StreamObserver<HeartStatus.StatusResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHeartStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHeartStatusMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                HeartStatus.StatusRequest,
                HeartStatus.StatusResponse>(
                  this, METHODID_HEART_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class HeartStatusStub extends io.grpc.stub.AbstractStub<HeartStatusStub> {
    private HeartStatusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartStatusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartStatusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartStatusStub(channel, callOptions);
    }

    /**
     * <pre>
     *Bi-directional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<HeartStatus.StatusRequest> heartStatus(
        io.grpc.stub.StreamObserver<HeartStatus.StatusResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHeartStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HeartStatusBlockingStub extends io.grpc.stub.AbstractStub<HeartStatusBlockingStub> {
    private HeartStatusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartStatusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartStatusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartStatusBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class HeartStatusFutureStub extends io.grpc.stub.AbstractStub<HeartStatusFutureStub> {
    private HeartStatusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartStatusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartStatusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartStatusFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_HEART_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeartStatusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeartStatusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEART_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heartStatus(
              (io.grpc.stub.StreamObserver<HeartStatus.StatusResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeartStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartStatusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HeartStatus.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeartStatus");
    }
  }

  private static final class HeartStatusFileDescriptorSupplier
      extends HeartStatusBaseDescriptorSupplier {
    HeartStatusFileDescriptorSupplier() {}
  }

  private static final class HeartStatusMethodDescriptorSupplier
      extends HeartStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeartStatusMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeartStatusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartStatusFileDescriptorSupplier())
              .addMethod(getHeartStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
