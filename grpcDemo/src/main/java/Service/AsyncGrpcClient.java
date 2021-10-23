package Service;

import com.cmpe275.lab1.userGrpc;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AsyncGrpcClient {
	
	private static long start ;

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).maxInboundMessageSize(1024*1024*1024).usePlaintext().build();
		
		userStub userStub = userGrpc.newStub(channel);
		
		try {
			start = System.currentTimeMillis();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		for(int i=0;i<200;i++) {
			userStub.getMesonetData2(null, new mesonetCallback());
		}
		
		while(true) {}
	}
	
	private static class mesonetCallback implements StreamObserver<MesonetDataList> {
		
        @Override
        public void onNext(MesonetDataList value) {
                	
        	long end = System.currentTimeMillis();
            System.out.println("time taken : " + (end-start));
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