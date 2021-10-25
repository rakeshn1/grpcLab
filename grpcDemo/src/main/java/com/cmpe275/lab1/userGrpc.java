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

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.AllData> getGetAllDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllData",
      requestType = com.cmpe275.lab1.User.Empty.class,
      responseType = com.cmpe275.lab1.User.AllData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.AllData> getGetAllDataMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.AllData> getGetAllDataMethod;
    if ((getGetAllDataMethod = userGrpc.getGetAllDataMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetAllDataMethod = userGrpc.getGetAllDataMethod) == null) {
          userGrpc.getGetAllDataMethod = getGetAllDataMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.AllData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getAllData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.AllData.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getAllData"))
                  .build();
          }
        }
     }
     return getGetAllDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.StationRequest,
      com.cmpe275.lab1.User.AllData> getGetStationDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStationData",
      requestType = com.cmpe275.lab1.User.StationRequest.class,
      responseType = com.cmpe275.lab1.User.AllData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.StationRequest,
      com.cmpe275.lab1.User.AllData> getGetStationDataMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.StationRequest, com.cmpe275.lab1.User.AllData> getGetStationDataMethod;
    if ((getGetStationDataMethod = userGrpc.getGetStationDataMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetStationDataMethod = userGrpc.getGetStationDataMethod) == null) {
          userGrpc.getGetStationDataMethod = getGetStationDataMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.StationRequest, com.cmpe275.lab1.User.AllData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getStationData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.StationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.AllData.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getStationData"))
                  .build();
          }
        }
     }
     return getGetStationDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.StationRequest,
      com.cmpe275.lab1.User.Weather> getGetWeatherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWeather",
      requestType = com.cmpe275.lab1.User.StationRequest.class,
      responseType = com.cmpe275.lab1.User.Weather.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.StationRequest,
      com.cmpe275.lab1.User.Weather> getGetWeatherMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.StationRequest, com.cmpe275.lab1.User.Weather> getGetWeatherMethod;
    if ((getGetWeatherMethod = userGrpc.getGetWeatherMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetWeatherMethod = userGrpc.getGetWeatherMethod) == null) {
          userGrpc.getGetWeatherMethod = getGetWeatherMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.StationRequest, com.cmpe275.lab1.User.Weather>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getWeather"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.StationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Weather.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getWeather"))
                  .build();
          }
        }
     }
     return getGetWeatherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetTopTenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopTen",
      requestType = com.cmpe275.lab1.User.Empty.class,
      responseType = com.cmpe275.lab1.User.MesonetDataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty,
      com.cmpe275.lab1.User.MesonetDataList> getGetTopTenMethod() {
    io.grpc.MethodDescriptor<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList> getGetTopTenMethod;
    if ((getGetTopTenMethod = userGrpc.getGetTopTenMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetTopTenMethod = userGrpc.getGetTopTenMethod) == null) {
          userGrpc.getGetTopTenMethod = getGetTopTenMethod = 
              io.grpc.MethodDescriptor.<com.cmpe275.lab1.User.Empty, com.cmpe275.lab1.User.MesonetDataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getTopTen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cmpe275.lab1.User.MesonetDataList.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getTopTen"))
                  .build();
          }
        }
     }
     return getGetTopTenMethod;
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
    public void getMesonetData(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMesonetDataMethod(), responseObserver);
    }

    /**
     */
    public void getMesonetDataStream(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMesonetDataStreamMethod(), responseObserver);
    }

    /**
     */
    public void getAllData(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.AllData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllDataMethod(), responseObserver);
    }

    /**
     */
    public void getStationData(com.cmpe275.lab1.User.StationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.AllData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStationDataMethod(), responseObserver);
    }

    /**
     */
    public void getWeather(com.cmpe275.lab1.User.StationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.Weather> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWeatherMethod(), responseObserver);
    }

    /**
     */
    public void getTopTen(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopTenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMesonetDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.MesonetDataList>(
                  this, METHODID_GET_MESONET_DATA)))
          .addMethod(
            getGetMesonetDataStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.MesonetDataList>(
                  this, METHODID_GET_MESONET_DATA_STREAM)))
          .addMethod(
            getGetAllDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.AllData>(
                  this, METHODID_GET_ALL_DATA)))
          .addMethod(
            getGetStationDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.StationRequest,
                com.cmpe275.lab1.User.AllData>(
                  this, METHODID_GET_STATION_DATA)))
          .addMethod(
            getGetWeatherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.StationRequest,
                com.cmpe275.lab1.User.Weather>(
                  this, METHODID_GET_WEATHER)))
          .addMethod(
            getGetTopTenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.lab1.User.Empty,
                com.cmpe275.lab1.User.MesonetDataList>(
                  this, METHODID_GET_TOP_TEN)))
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
    public void getMesonetData(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMesonetDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMesonetDataStream(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMesonetDataStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllData(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.AllData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStationData(com.cmpe275.lab1.User.StationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.AllData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStationDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWeather(com.cmpe275.lab1.User.StationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.Weather> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWeatherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTopTen(com.cmpe275.lab1.User.Empty request,
        io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopTenMethod(), getCallOptions()), request, responseObserver);
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
    public com.cmpe275.lab1.User.MesonetDataList getMesonetData(com.cmpe275.lab1.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMesonetDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.cmpe275.lab1.User.MesonetDataList> getMesonetDataStream(
        com.cmpe275.lab1.User.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMesonetDataStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.AllData getAllData(com.cmpe275.lab1.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.AllData getStationData(com.cmpe275.lab1.User.StationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStationDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.Weather getWeather(com.cmpe275.lab1.User.StationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWeatherMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.lab1.User.MesonetDataList getTopTen(com.cmpe275.lab1.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetTopTenMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.MesonetDataList> getMesonetData(
        com.cmpe275.lab1.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMesonetDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.AllData> getAllData(
        com.cmpe275.lab1.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.AllData> getStationData(
        com.cmpe275.lab1.User.StationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStationDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.Weather> getWeather(
        com.cmpe275.lab1.User.StationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWeatherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.lab1.User.MesonetDataList> getTopTen(
        com.cmpe275.lab1.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopTenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MESONET_DATA = 0;
  private static final int METHODID_GET_MESONET_DATA_STREAM = 1;
  private static final int METHODID_GET_ALL_DATA = 2;
  private static final int METHODID_GET_STATION_DATA = 3;
  private static final int METHODID_GET_WEATHER = 4;
  private static final int METHODID_GET_TOP_TEN = 5;

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
        case METHODID_GET_MESONET_DATA:
          serviceImpl.getMesonetData((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList>) responseObserver);
          break;
        case METHODID_GET_MESONET_DATA_STREAM:
          serviceImpl.getMesonetDataStream((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.MesonetDataList>) responseObserver);
          break;
        case METHODID_GET_ALL_DATA:
          serviceImpl.getAllData((com.cmpe275.lab1.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.AllData>) responseObserver);
          break;
        case METHODID_GET_STATION_DATA:
          serviceImpl.getStationData((com.cmpe275.lab1.User.StationRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.AllData>) responseObserver);
          break;
        case METHODID_GET_WEATHER:
          serviceImpl.getWeather((com.cmpe275.lab1.User.StationRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.lab1.User.Weather>) responseObserver);
          break;
        case METHODID_GET_TOP_TEN:
          serviceImpl.getTopTen((com.cmpe275.lab1.User.Empty) request,
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
              .addMethod(getGetMesonetDataMethod())
              .addMethod(getGetMesonetDataStreamMethod())
              .addMethod(getGetAllDataMethod())
              .addMethod(getGetStationDataMethod())
              .addMethod(getGetWeatherMethod())
              .addMethod(getGetTopTenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
