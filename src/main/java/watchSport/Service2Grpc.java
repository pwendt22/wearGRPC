package watchSport;

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
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "wearGRPC.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<watchSport.runData,
      watchSport.runAnalysis> getRunningMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "running",
      requestType = watchSport.runData.class,
      responseType = watchSport.runAnalysis.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<watchSport.runData,
      watchSport.runAnalysis> getRunningMethod() {
    io.grpc.MethodDescriptor<watchSport.runData, watchSport.runAnalysis> getRunningMethod;
    if ((getRunningMethod = Service2Grpc.getRunningMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getRunningMethod = Service2Grpc.getRunningMethod) == null) {
          Service2Grpc.getRunningMethod = getRunningMethod = 
              io.grpc.MethodDescriptor.<watchSport.runData, watchSport.runAnalysis>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service2", "running"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchSport.runData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchSport.runAnalysis.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("running"))
                  .build();
          }
        }
     }
     return getRunningMethod;
  }

  private static volatile io.grpc.MethodDescriptor<watchSport.sportData,
      watchSport.sportAnalysis> getSportModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sportMode",
      requestType = watchSport.sportData.class,
      responseType = watchSport.sportAnalysis.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<watchSport.sportData,
      watchSport.sportAnalysis> getSportModeMethod() {
    io.grpc.MethodDescriptor<watchSport.sportData, watchSport.sportAnalysis> getSportModeMethod;
    if ((getSportModeMethod = Service2Grpc.getSportModeMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getSportModeMethod = Service2Grpc.getSportModeMethod) == null) {
          Service2Grpc.getSportModeMethod = getSportModeMethod = 
              io.grpc.MethodDescriptor.<watchSport.sportData, watchSport.sportAnalysis>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service2", "sportMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchSport.sportData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchSport.sportAnalysis.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("sportMode"))
                  .build();
          }
        }
     }
     return getSportModeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Running mode
     *RPC server stream
     * </pre>
     */
    public void running(watchSport.runData request,
        io.grpc.stub.StreamObserver<watchSport.runAnalysis> responseObserver) {
      asyncUnimplementedUnaryCall(getRunningMethod(), responseObserver);
    }

    /**
     * <pre>
     *Calories burned - RPC Bidirectional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<watchSport.sportData> sportMode(
        io.grpc.stub.StreamObserver<watchSport.sportAnalysis> responseObserver) {
      return asyncUnimplementedStreamingCall(getSportModeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRunningMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                watchSport.runData,
                watchSport.runAnalysis>(
                  this, METHODID_RUNNING)))
          .addMethod(
            getSportModeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                watchSport.sportData,
                watchSport.sportAnalysis>(
                  this, METHODID_SPORT_MODE)))
          .build();
    }
  }

  /**
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *Running mode
     *RPC server stream
     * </pre>
     */
    public void running(watchSport.runData request,
        io.grpc.stub.StreamObserver<watchSport.runAnalysis> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRunningMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Calories burned - RPC Bidirectional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<watchSport.sportData> sportMode(
        io.grpc.stub.StreamObserver<watchSport.sportAnalysis> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSportModeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Running mode
     *RPC server stream
     * </pre>
     */
    public java.util.Iterator<watchSport.runAnalysis> running(
        watchSport.runData request) {
      return blockingServerStreamingCall(
          getChannel(), getRunningMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RUNNING = 0;
  private static final int METHODID_SPORT_MODE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUNNING:
          serviceImpl.running((watchSport.runData) request,
              (io.grpc.stub.StreamObserver<watchSport.runAnalysis>) responseObserver);
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
        case METHODID_SPORT_MODE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sportMode(
              (io.grpc.stub.StreamObserver<watchSport.sportAnalysis>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return watchSport.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getRunningMethod())
              .addMethod(getSportModeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
