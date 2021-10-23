package Service;

import com.yrrhelp.grpc.User.APIResponse;
import com.yrrhelp.grpc.User.LoginRequest;
import com.yrrhelp.grpc.userGrpc;
import com.yrrhelp.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Date;

public class AsyncGrpcClient {

    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();

        // stubs - generate from proto

//		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
        userGrpc.userStub userStub = userGrpc.newStub(channel);

        LoginRequest loginrequest = LoginRequest.newBuilder().setUsername("RAM").setPassword("RAM").build();
        LoginRequest loginRequestFail = LoginRequest.newBuilder().setUsername("RAM").setPassword("RAMWE").build();
        //APIResponse response = userStub.login(loginrequest);

        userStub.login(loginrequest, new LoginCallBack());
        userStub.login(loginRequestFail, new LoginCallBack());
        userStub.login(loginrequest, new LoginCallBack());
        userStub.login(loginRequestFail, new LoginCallBack());
        userStub.login(loginrequest, new LoginCallBack());

        Thread.sleep(1000);
        //System.out.println(response.getResponsemessage());
        System.out.println("Done");

    }


    private static class LoginCallBack implements StreamObserver<APIResponse> {
        @Override
        public void onNext(APIResponse value) {
            System.out.println(System.currentTimeMillis());
            System.out.println("Received response :"+ value);
        }

        @Override
        public void onError(Throwable cause) {
            System.out.println("Error occurred, cause :"+cause.getMessage());
        }

        @Override
        public void onCompleted() {
            System.out.println("Stream completed");
        }
    }

}



