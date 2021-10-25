package com.cmpe275.lab1;

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
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.LoginRequest,
      com.cmpe275.lab1.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.cmpe275.lab1.User.LoginRequest.class,
      responseType = com.cmpe275.lab1.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.LoginRequest,
      com.cmpe275.lab1.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.LoginRequest, com.cmpe275.lab1.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
          userGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.LoginRequest, com.cmpe275.lab1.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.cmpe275.lab1.User.Empty.class,
      responseType = com.cmpe275.lab1.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
          userGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetMesonetDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMesonetData",
      requestType = com.cmpe275.lab1.User.Empty.class,
      responseType = com.cmpe275.lab1.User.MesonetDataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetMesonetDataMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList> getGetMesonetDataMethod;
    if ((getGetMesonetDataMethod = userGrpc.getGetMesonetDataMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetMesonetDataMethod = userGrpc.getGetMesonetDataMethod) == null) {
          userGrpc.getGetMesonetDataMethod = getGetMesonetDataMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getMesonetData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.MesonetDataList.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getMesonetData"))
                  .build();
          }
        }
     }
     return getGetMesonetDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetMesonetData2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMesonetData2",
      requestType = com.cmpe275.lab1.User.Empty.class,
      responseType = com.cmpe275.lab1.User.MesonetDataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetMesonetData2Method() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList> getGetMesonetData2Method;
    if ((getGetMesonetData2Method = userGrpc.getGetMesonetData2Method) == null) {
      synchronized (userGrpc.class) {
        if ((getGetMesonetData2Method = userGrpc.getGetMesonetData2Method) == null) {
          userGrpc.getGetMesonetData2Method = getGetMesonetData2Method = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getMesonetData2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.MesonetDataList.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getMesonetData2"))
                  .build();
          }
        }
     }
     return getGetMesonetData2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetMesonetDataStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMesonetDataStream",
      requestType = com.cmpe275.lab1.User.Empty.class,
      responseType = com.cmpe275.lab1.User.MesonetDataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetMesonetDataStreamMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList> getGetMesonetDataStreamMethod;
    if ((getGetMesonetDataStreamMethod = userGrpc.getGetMesonetDataStreamMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetMesonetDataStreamMethod = userGrpc.getGetMesonetDataStreamMethod) == null) {
          userGrpc.getGetMesonetDataStreamMethod = getGetMesonetDataStreamMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "user", "getMesonetDataStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.MesonetDataList.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getMesonetDataStream"))
                  .build();
          }
        }
     }
     return getGetMesonetDataStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.cmpe275.lab1.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void getMesonetData(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMesonetDataMethod(), responseObserver);
    }

    /**
     */
    public void getMesonetData2(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMesonetData2Method(), responseObserver);
    }

    /**
     */
    public void getMesonetDataStream(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMesonetDataStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.LoginRequest,
                com.cmpe275.lab1.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getGetMesonetDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.MesonetDataList>(
                  this, METHODID_GET_MESONET_DATA)))
          .addMethod(
            getGetMesonetData2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.MesonetDataList>(
                  this, METHODID_GET_MESONET_DATA2)))
          .addMethod(
            getGetMesonetDataStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.MesonetDataList>(
                  this, METHODID_GET_MESONET_DATA_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void login(com.cmpe275.lab1.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMesonetData(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMesonetDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMesonetData2(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMesonetData2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMesonetDataStream(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMesonetDataStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cmpe275.lab1.User.APIResponse login(com.cmpe275.lab1.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.APIResponse logout(com.cmpe275.lab1.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.MesonetDataList getMesonetData(com.cmpe275.lab1.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMesonetDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.MesonetDataList getMesonetData2(com.cmpe275.lab1.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMesonetData2Method(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.cmpe275.lab1.User.MesonetDataList> getMesonetDataStream(
        com.cmpe275.lab1.User.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMesonetDataStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.APIResponse> login(
        com.cmpe275.lab1.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.APIResponse> logout(
        com.cmpe275.lab1.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.MesonetDataList> getMesonetData(
        com.cmpe275.lab1.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMesonetDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.MesonetDataList> getMesonetData2(
        com.cmpe275.lab1.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMesonetData2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_GET_MESONET_DATA = 2;
  private static final int METHODID_GET_MESONET_DATA2 = 3;
  private static final int METHODID_GET_MESONET_DATA_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.cmpe275.lab1.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.APIResponse>) responseObserver);
          break;
        case METHODID_GET_MESONET_DATA:
          serviceImpl.getMesonetData((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList>) responseObserver);
          break;
        case METHODID_GET_MESONET_DATA2:
          serviceImpl.getMesonetData2((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList>) responseObserver);
          break;
        case METHODID_GET_MESONET_DATA_STREAM:
          serviceImpl.getMesonetDataStream((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList>) responseObserver);
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cmpe275.lab1.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getGetMesonetDataMethod())
              .addMethod(getGetMesonetData2Method())
              .addMethod(getGetMesonetDataStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
