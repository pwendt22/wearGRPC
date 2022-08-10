package smartGlasses;

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
    comments = "Source: service3.proto")
public final class Service3Grpc {

  private Service3Grpc() {}

  public static final String SERVICE_NAME = "wearGRPC.Service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartGlasses.choseVideo,
      smartGlasses.playingVideo> getPlayVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "playVideo",
      requestType = smartGlasses.choseVideo.class,
      responseType = smartGlasses.playingVideo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smartGlasses.choseVideo,
      smartGlasses.playingVideo> getPlayVideoMethod() {
    io.grpc.MethodDescriptor<smartGlasses.choseVideo, smartGlasses.playingVideo> getPlayVideoMethod;
    if ((getPlayVideoMethod = Service3Grpc.getPlayVideoMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getPlayVideoMethod = Service3Grpc.getPlayVideoMethod) == null) {
          Service3Grpc.getPlayVideoMethod = getPlayVideoMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.choseVideo, smartGlasses.playingVideo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service3", "playVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.choseVideo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.playingVideo.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("playVideo"))
                  .build();
          }
        }
     }
     return getPlayVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartGlasses.activation,
      smartGlasses.confirmActivation> getActBluetoothMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "actBluetooth",
      requestType = smartGlasses.activation.class,
      responseType = smartGlasses.confirmActivation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartGlasses.activation,
      smartGlasses.confirmActivation> getActBluetoothMethod() {
    io.grpc.MethodDescriptor<smartGlasses.activation, smartGlasses.confirmActivation> getActBluetoothMethod;
    if ((getActBluetoothMethod = Service3Grpc.getActBluetoothMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getActBluetoothMethod = Service3Grpc.getActBluetoothMethod) == null) {
          Service3Grpc.getActBluetoothMethod = getActBluetoothMethod = 
              io.grpc.MethodDescriptor.<smartGlasses.activation, smartGlasses.confirmActivation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service3", "actBluetooth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.activation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartGlasses.confirmActivation.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("actBluetooth"))
                  .build();
          }
        }
     }
     return getActBluetoothMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service3Stub newStub(io.grpc.Channel channel) {
    return new Service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service3FutureStub(channel);
  }

  /**
   */
  public static abstract class Service3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *RPC Server Streaming
     * </pre>
     */
    public void playVideo(smartGlasses.choseVideo request,
        io.grpc.stub.StreamObserver<smartGlasses.playingVideo> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     *Activate Bluetooth - RPC Unary
     * </pre>
     */
    public void actBluetooth(smartGlasses.activation request,
        io.grpc.stub.StreamObserver<smartGlasses.confirmActivation> responseObserver) {
      asyncUnimplementedUnaryCall(getActBluetoothMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayVideoMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                smartGlasses.choseVideo,
                smartGlasses.playingVideo>(
                  this, METHODID_PLAY_VIDEO)))
          .addMethod(
            getActBluetoothMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartGlasses.activation,
                smartGlasses.confirmActivation>(
                  this, METHODID_ACT_BLUETOOTH)))
          .build();
    }
  }

  /**
   */
  public static final class Service3Stub extends io.grpc.stub.AbstractStub<Service3Stub> {
    private Service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3Stub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC Server Streaming
     * </pre>
     */
    public void playVideo(smartGlasses.choseVideo request,
        io.grpc.stub.StreamObserver<smartGlasses.playingVideo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlayVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Activate Bluetooth - RPC Unary
     * </pre>
     */
    public void actBluetooth(smartGlasses.activation request,
        io.grpc.stub.StreamObserver<smartGlasses.confirmActivation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActBluetoothMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Service3BlockingStub extends io.grpc.stub.AbstractStub<Service3BlockingStub> {
    private Service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC Server Streaming
     * </pre>
     */
    public java.util.Iterator<smartGlasses.playingVideo> playVideo(
        smartGlasses.choseVideo request) {
      return blockingServerStreamingCall(
          getChannel(), getPlayVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Activate Bluetooth - RPC Unary
     * </pre>
     */
    public smartGlasses.confirmActivation actBluetooth(smartGlasses.activation request) {
      return blockingUnaryCall(
          getChannel(), getActBluetoothMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service3FutureStub extends io.grpc.stub.AbstractStub<Service3FutureStub> {
    private Service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Activate Bluetooth - RPC Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartGlasses.confirmActivation> actBluetooth(
        smartGlasses.activation request) {
      return futureUnaryCall(
          getChannel().newCall(getActBluetoothMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_VIDEO = 0;
  private static final int METHODID_ACT_BLUETOOTH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY_VIDEO:
          serviceImpl.playVideo((smartGlasses.choseVideo) request,
              (io.grpc.stub.StreamObserver<smartGlasses.playingVideo>) responseObserver);
          break;
        case METHODID_ACT_BLUETOOTH:
          serviceImpl.actBluetooth((smartGlasses.activation) request,
              (io.grpc.stub.StreamObserver<smartGlasses.confirmActivation>) responseObserver);
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

  private static abstract class Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartGlasses.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service3");
    }
  }

  private static final class Service3FileDescriptorSupplier
      extends Service3BaseDescriptorSupplier {
    Service3FileDescriptorSupplier() {}
  }

  private static final class Service3MethodDescriptorSupplier
      extends Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service3FileDescriptorSupplier())
              .addMethod(getPlayVideoMethod())
              .addMethod(getActBluetoothMethod())
              .build();
        }
      }
    }
    return result;
  }
}
