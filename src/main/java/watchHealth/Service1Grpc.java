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
  private static volatile io.grpc.MethodDescriptor<watchHealth.MovimentRequest,
      watchHealth.StatusSedentary> getSedentaryReminderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sedentaryReminder",
      requestType = watchHealth.MovimentRequest.class,
      responseType = watchHealth.StatusSedentary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<watchHealth.MovimentRequest,
      watchHealth.StatusSedentary> getSedentaryReminderMethod() {
    io.grpc.MethodDescriptor<watchHealth.MovimentRequest, watchHealth.StatusSedentary> getSedentaryReminderMethod;
    if ((getSedentaryReminderMethod = Service1Grpc.getSedentaryReminderMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getSedentaryReminderMethod = Service1Grpc.getSedentaryReminderMethod) == null) {
          Service1Grpc.getSedentaryReminderMethod = getSedentaryReminderMethod = 
              io.grpc.MethodDescriptor.<watchHealth.MovimentRequest, watchHealth.StatusSedentary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "wearGRPC.Service1", "sedentaryReminder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchHealth.MovimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  watchHealth.StatusSedentary.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("sedentaryReminder"))
                  .build();
          }
        }
     }
     return getSedentaryReminderMethod;
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
     *unary
     * </pre>
     */
    public void sedentaryReminder(watchHealth.MovimentRequest request,
        io.grpc.stub.StreamObserver<watchHealth.StatusSedentary> responseObserver) {
      asyncUnimplementedUnaryCall(getSedentaryReminderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSedentaryReminderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                watchHealth.MovimentRequest,
                watchHealth.StatusSedentary>(
                  this, METHODID_SEDENTARY_REMINDER)))
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
     *unary
     * </pre>
     */
    public void sedentaryReminder(watchHealth.MovimentRequest request,
        io.grpc.stub.StreamObserver<watchHealth.StatusSedentary> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSedentaryReminderMethod(), getCallOptions()), request, responseObserver);
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
     *unary
     * </pre>
     */
    public watchHealth.StatusSedentary sedentaryReminder(watchHealth.MovimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getSedentaryReminderMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<watchHealth.StatusSedentary> sedentaryReminder(
        watchHealth.MovimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSedentaryReminderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEDENTARY_REMINDER = 0;

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
        case METHODID_SEDENTARY_REMINDER:
          serviceImpl.sedentaryReminder((watchHealth.MovimentRequest) request,
              (io.grpc.stub.StreamObserver<watchHealth.StatusSedentary>) responseObserver);
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
              .addMethod(getSedentaryReminderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
