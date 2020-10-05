package com.proto.lyft;

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
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: lyft/lyft.proto")
public final class LyftServiceGrpc {

  private LyftServiceGrpc() {}

  public static final String SERVICE_NAME = "lyft.LyftService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.lyft.CreateLyftRequest,
      com.proto.lyft.CreateLyftResponse> getCreateLyftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLyft",
      requestType = com.proto.lyft.CreateLyftRequest.class,
      responseType = com.proto.lyft.CreateLyftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.lyft.CreateLyftRequest,
      com.proto.lyft.CreateLyftResponse> getCreateLyftMethod() {
    io.grpc.MethodDescriptor<com.proto.lyft.CreateLyftRequest, com.proto.lyft.CreateLyftResponse> getCreateLyftMethod;
    if ((getCreateLyftMethod = LyftServiceGrpc.getCreateLyftMethod) == null) {
      synchronized (LyftServiceGrpc.class) {
        if ((getCreateLyftMethod = LyftServiceGrpc.getCreateLyftMethod) == null) {
          LyftServiceGrpc.getCreateLyftMethod = getCreateLyftMethod =
              io.grpc.MethodDescriptor.<com.proto.lyft.CreateLyftRequest, com.proto.lyft.CreateLyftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLyft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.lyft.CreateLyftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.lyft.CreateLyftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LyftServiceMethodDescriptorSupplier("CreateLyft"))
              .build();
        }
      }
    }
    return getCreateLyftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.lyft.ReadLyftRequest,
      com.proto.lyft.ReadLyftResponse> getReadLyftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadLyft",
      requestType = com.proto.lyft.ReadLyftRequest.class,
      responseType = com.proto.lyft.ReadLyftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.lyft.ReadLyftRequest,
      com.proto.lyft.ReadLyftResponse> getReadLyftMethod() {
    io.grpc.MethodDescriptor<com.proto.lyft.ReadLyftRequest, com.proto.lyft.ReadLyftResponse> getReadLyftMethod;
    if ((getReadLyftMethod = LyftServiceGrpc.getReadLyftMethod) == null) {
      synchronized (LyftServiceGrpc.class) {
        if ((getReadLyftMethod = LyftServiceGrpc.getReadLyftMethod) == null) {
          LyftServiceGrpc.getReadLyftMethod = getReadLyftMethod =
              io.grpc.MethodDescriptor.<com.proto.lyft.ReadLyftRequest, com.proto.lyft.ReadLyftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadLyft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.lyft.ReadLyftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.lyft.ReadLyftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LyftServiceMethodDescriptorSupplier("ReadLyft"))
              .build();
        }
      }
    }
    return getReadLyftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.lyft.ListLyftRequest,
      com.proto.lyft.ListLyftResponse> getListLyftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLyft",
      requestType = com.proto.lyft.ListLyftRequest.class,
      responseType = com.proto.lyft.ListLyftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.lyft.ListLyftRequest,
      com.proto.lyft.ListLyftResponse> getListLyftMethod() {
    io.grpc.MethodDescriptor<com.proto.lyft.ListLyftRequest, com.proto.lyft.ListLyftResponse> getListLyftMethod;
    if ((getListLyftMethod = LyftServiceGrpc.getListLyftMethod) == null) {
      synchronized (LyftServiceGrpc.class) {
        if ((getListLyftMethod = LyftServiceGrpc.getListLyftMethod) == null) {
          LyftServiceGrpc.getListLyftMethod = getListLyftMethod =
              io.grpc.MethodDescriptor.<com.proto.lyft.ListLyftRequest, com.proto.lyft.ListLyftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLyft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.lyft.ListLyftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.lyft.ListLyftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LyftServiceMethodDescriptorSupplier("ListLyft"))
              .build();
        }
      }
    }
    return getListLyftMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LyftServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LyftServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LyftServiceStub>() {
        @java.lang.Override
        public LyftServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LyftServiceStub(channel, callOptions);
        }
      };
    return LyftServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LyftServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LyftServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LyftServiceBlockingStub>() {
        @java.lang.Override
        public LyftServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LyftServiceBlockingStub(channel, callOptions);
        }
      };
    return LyftServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LyftServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LyftServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LyftServiceFutureStub>() {
        @java.lang.Override
        public LyftServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LyftServiceFutureStub(channel, callOptions);
        }
      };
    return LyftServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LyftServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createLyft(com.proto.lyft.CreateLyftRequest request,
        io.grpc.stub.StreamObserver<com.proto.lyft.CreateLyftResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateLyftMethod(), responseObserver);
    }

    /**
     */
    public void readLyft(com.proto.lyft.ReadLyftRequest request,
        io.grpc.stub.StreamObserver<com.proto.lyft.ReadLyftResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadLyftMethod(), responseObserver);
    }

    /**
     */
    public void listLyft(com.proto.lyft.ListLyftRequest request,
        io.grpc.stub.StreamObserver<com.proto.lyft.ListLyftResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListLyftMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateLyftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.lyft.CreateLyftRequest,
                com.proto.lyft.CreateLyftResponse>(
                  this, METHODID_CREATE_LYFT)))
          .addMethod(
            getReadLyftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.lyft.ReadLyftRequest,
                com.proto.lyft.ReadLyftResponse>(
                  this, METHODID_READ_LYFT)))
          .addMethod(
            getListLyftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.lyft.ListLyftRequest,
                com.proto.lyft.ListLyftResponse>(
                  this, METHODID_LIST_LYFT)))
          .build();
    }
  }

  /**
   */
  public static final class LyftServiceStub extends io.grpc.stub.AbstractAsyncStub<LyftServiceStub> {
    private LyftServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LyftServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LyftServiceStub(channel, callOptions);
    }

    /**
     */
    public void createLyft(com.proto.lyft.CreateLyftRequest request,
        io.grpc.stub.StreamObserver<com.proto.lyft.CreateLyftResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateLyftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readLyft(com.proto.lyft.ReadLyftRequest request,
        io.grpc.stub.StreamObserver<com.proto.lyft.ReadLyftResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadLyftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLyft(com.proto.lyft.ListLyftRequest request,
        io.grpc.stub.StreamObserver<com.proto.lyft.ListLyftResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLyftMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LyftServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LyftServiceBlockingStub> {
    private LyftServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LyftServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LyftServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.lyft.CreateLyftResponse createLyft(com.proto.lyft.CreateLyftRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateLyftMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.lyft.ReadLyftResponse readLyft(com.proto.lyft.ReadLyftRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadLyftMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.lyft.ListLyftResponse listLyft(com.proto.lyft.ListLyftRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLyftMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LyftServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LyftServiceFutureStub> {
    private LyftServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LyftServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LyftServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.lyft.CreateLyftResponse> createLyft(
        com.proto.lyft.CreateLyftRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateLyftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.lyft.ReadLyftResponse> readLyft(
        com.proto.lyft.ReadLyftRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadLyftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.lyft.ListLyftResponse> listLyft(
        com.proto.lyft.ListLyftRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLyftMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LYFT = 0;
  private static final int METHODID_READ_LYFT = 1;
  private static final int METHODID_LIST_LYFT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LyftServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LyftServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_LYFT:
          serviceImpl.createLyft((com.proto.lyft.CreateLyftRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.lyft.CreateLyftResponse>) responseObserver);
          break;
        case METHODID_READ_LYFT:
          serviceImpl.readLyft((com.proto.lyft.ReadLyftRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.lyft.ReadLyftResponse>) responseObserver);
          break;
        case METHODID_LIST_LYFT:
          serviceImpl.listLyft((com.proto.lyft.ListLyftRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.lyft.ListLyftResponse>) responseObserver);
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

  private static abstract class LyftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LyftServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.lyft.LyftOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LyftService");
    }
  }

  private static final class LyftServiceFileDescriptorSupplier
      extends LyftServiceBaseDescriptorSupplier {
    LyftServiceFileDescriptorSupplier() {}
  }

  private static final class LyftServiceMethodDescriptorSupplier
      extends LyftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LyftServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LyftServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LyftServiceFileDescriptorSupplier())
              .addMethod(getCreateLyftMethod())
              .addMethod(getReadLyftMethod())
              .addMethod(getListLyftMethod())
              .build();
        }
      }
    }
    return result;
  }
}
