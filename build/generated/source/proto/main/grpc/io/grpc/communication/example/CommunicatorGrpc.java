package io.grpc.communication.example;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: communication.proto")
public final class CommunicatorGrpc {

  private CommunicatorGrpc() {}

  public static final String SERVICE_NAME = "communication.Communicator";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendMessageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> METHOD_SEND_MESSAGE = getSendMessageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> getSendMessageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> getSendMessageMethod() {
    return getSendMessageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> getSendMessageMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest, io.grpc.communication.example.DigitalReply> getSendMessageMethod;
    if ((getSendMessageMethod = CommunicatorGrpc.getSendMessageMethod) == null) {
      synchronized (CommunicatorGrpc.class) {
        if ((getSendMessageMethod = CommunicatorGrpc.getSendMessageMethod) == null) {
          CommunicatorGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<io.grpc.communication.example.DigitalRequest, io.grpc.communication.example.DigitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "communication.Communicator", "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.communication.example.DigitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.communication.example.DigitalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CommunicatorMethodDescriptorSupplier("SendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendMessageAgainMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> METHOD_SEND_MESSAGE_AGAIN = getSendMessageAgainMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> getSendMessageAgainMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> getSendMessageAgainMethod() {
    return getSendMessageAgainMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest,
      io.grpc.communication.example.DigitalReply> getSendMessageAgainMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.communication.example.DigitalRequest, io.grpc.communication.example.DigitalReply> getSendMessageAgainMethod;
    if ((getSendMessageAgainMethod = CommunicatorGrpc.getSendMessageAgainMethod) == null) {
      synchronized (CommunicatorGrpc.class) {
        if ((getSendMessageAgainMethod = CommunicatorGrpc.getSendMessageAgainMethod) == null) {
          CommunicatorGrpc.getSendMessageAgainMethod = getSendMessageAgainMethod = 
              io.grpc.MethodDescriptor.<io.grpc.communication.example.DigitalRequest, io.grpc.communication.example.DigitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "communication.Communicator", "SendMessageAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.communication.example.DigitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.communication.example.DigitalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CommunicatorMethodDescriptorSupplier("SendMessageAgain"))
                  .build();
          }
        }
     }
     return getSendMessageAgainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommunicatorStub newStub(io.grpc.Channel channel) {
    return new CommunicatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommunicatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommunicatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommunicatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommunicatorFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class CommunicatorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sendMessage(io.grpc.communication.example.DigitalRequest request,
        io.grpc.stub.StreamObserver<io.grpc.communication.example.DigitalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sendMessageAgain(io.grpc.communication.example.DigitalRequest request,
        io.grpc.stub.StreamObserver<io.grpc.communication.example.DigitalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageAgainMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.communication.example.DigitalRequest,
                io.grpc.communication.example.DigitalReply>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getSendMessageAgainMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.communication.example.DigitalRequest,
                io.grpc.communication.example.DigitalReply>(
                  this, METHODID_SEND_MESSAGE_AGAIN)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CommunicatorStub extends io.grpc.stub.AbstractStub<CommunicatorStub> {
    private CommunicatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommunicatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommunicatorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sendMessage(io.grpc.communication.example.DigitalRequest request,
        io.grpc.stub.StreamObserver<io.grpc.communication.example.DigitalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sendMessageAgain(io.grpc.communication.example.DigitalRequest request,
        io.grpc.stub.StreamObserver<io.grpc.communication.example.DigitalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageAgainMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CommunicatorBlockingStub extends io.grpc.stub.AbstractStub<CommunicatorBlockingStub> {
    private CommunicatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommunicatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommunicatorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.communication.example.DigitalReply sendMessage(io.grpc.communication.example.DigitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public io.grpc.communication.example.DigitalReply sendMessageAgain(io.grpc.communication.example.DigitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageAgainMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CommunicatorFutureStub extends io.grpc.stub.AbstractStub<CommunicatorFutureStub> {
    private CommunicatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommunicatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommunicatorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.communication.example.DigitalReply> sendMessage(
        io.grpc.communication.example.DigitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.communication.example.DigitalReply> sendMessageAgain(
        io.grpc.communication.example.DigitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageAgainMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_SEND_MESSAGE_AGAIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommunicatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommunicatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((io.grpc.communication.example.DigitalRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.communication.example.DigitalReply>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE_AGAIN:
          serviceImpl.sendMessageAgain((io.grpc.communication.example.DigitalRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.communication.example.DigitalReply>) responseObserver);
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

  private static abstract class CommunicatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommunicatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.communication.example.CommunicationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Communicator");
    }
  }

  private static final class CommunicatorFileDescriptorSupplier
      extends CommunicatorBaseDescriptorSupplier {
    CommunicatorFileDescriptorSupplier() {}
  }

  private static final class CommunicatorMethodDescriptorSupplier
      extends CommunicatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommunicatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommunicatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommunicatorFileDescriptorSupplier())
              .addMethod(getSendMessageMethodHelper())
              .addMethod(getSendMessageAgainMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
