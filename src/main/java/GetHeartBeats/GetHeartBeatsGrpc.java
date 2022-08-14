package GetHeartBeats;

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
public final class GetHeartBeatsGrpc {

  private GetHeartBeatsGrpc() {}

  public static final String SERVICE_NAME = "wearGRPC.GetHeartBeats";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GetHeartBeats.BeatsServerStreamRequest,
      GetHeartBeats.BeatsResponse> getGetHeartBeatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHeartBeats",
      requestType = GetHeartBeats.BeatsServerStreamRequest.class,
      responseType = GetHeartBeats.BeatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GetHeartBeats.BeatsServerStreamRequest,
      GetHeartBeats.BeatsResponse> getGetHeartBeatsMethod() {
    io.grpc.MethodDescriptor<GetHeartBeats.BeatsServerStreamRequest, GetHeartBeats.BeatsResponse> getGetHeartBeatsMethod;
    if ((getGetHeartBeatsMethod = GetHeartBeatsGrpc.getGetHeartBeatsMethod) == null) {
      synchronized (GetHeartBeatsGrpc.class) {
        if ((getGetHeartBeatsMethod = GetHeartBeatsGrpc.getGetHeartBeatsMethod) == null) {
          GetHeartBeatsGrpc.getGetHeartBeatsMethod = getGetHeartBeatsMethod = 
              io.grpc.MethodDescriptor.<GetHeartBeats.BeatsServerStreamRequest, GetHeartBeats.BeatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.GetHeartBeats", "GetHeartBeats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetHeartBeats.BeatsServerStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetHeartBeats.BeatsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GetHeartBeatsMethodDescriptorSupplier("GetHeartBeats"))
                  .build();
          }
        }
     }
     return getGetHeartBeatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetHeartBeatsStub newStub(io.grpc.Channel channel) {
    return new GetHeartBeatsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetHeartBeatsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetHeartBeatsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetHeartBeatsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetHeartBeatsFutureStub(channel);
  }

  /**
   */
  public static abstract class GetHeartBeatsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHeartBeats(GetHeartBeats.BeatsServerStreamRequest request,
        io.grpc.stub.StreamObserver<GetHeartBeats.BeatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHeartBeatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHeartBeatsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                GetHeartBeats.BeatsServerStreamRequest,
                GetHeartBeats.BeatsResponse>(
                  this, METHODID_GET_HEART_BEATS)))
          .build();
    }
  }

  /**
   */
  public static final class GetHeartBeatsStub extends io.grpc.stub.AbstractStub<GetHeartBeatsStub> {
    private GetHeartBeatsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetHeartBeatsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetHeartBeatsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetHeartBeatsStub(channel, callOptions);
    }

    /**
     */
    public void getHeartBeats(GetHeartBeats.BeatsServerStreamRequest request,
        io.grpc.stub.StreamObserver<GetHeartBeats.BeatsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetHeartBeatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetHeartBeatsBlockingStub extends io.grpc.stub.AbstractStub<GetHeartBeatsBlockingStub> {
    private GetHeartBeatsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetHeartBeatsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetHeartBeatsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetHeartBeatsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<GetHeartBeats.BeatsResponse> getHeartBeats(
        GetHeartBeats.BeatsServerStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetHeartBeatsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetHeartBeatsFutureStub extends io.grpc.stub.AbstractStub<GetHeartBeatsFutureStub> {
    private GetHeartBeatsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetHeartBeatsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetHeartBeatsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetHeartBeatsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_HEART_BEATS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetHeartBeatsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetHeartBeatsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEART_BEATS:
          serviceImpl.getHeartBeats((GetHeartBeats.BeatsServerStreamRequest) request,
              (io.grpc.stub.StreamObserver<GetHeartBeats.BeatsResponse>) responseObserver);
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

  private static abstract class GetHeartBeatsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetHeartBeatsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GetHeartBeats.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetHeartBeats");
    }
  }

  private static final class GetHeartBeatsFileDescriptorSupplier
      extends GetHeartBeatsBaseDescriptorSupplier {
    GetHeartBeatsFileDescriptorSupplier() {}
  }

  private static final class GetHeartBeatsMethodDescriptorSupplier
      extends GetHeartBeatsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetHeartBeatsMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetHeartBeatsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetHeartBeatsFileDescriptorSupplier())
              .addMethod(getGetHeartBeatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
