package Service;

import com.cmpe275.lab1.userGrpc;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AsyncGrpcClient {
	
	private static long start ;
	private static long count = 0 ;

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).maxInboundMessageSize(1024*1024*1024).usePlaintext().build();
		
		
		
		try {
			start = System.currentTimeMillis();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		for(int i=0;i<10000;i++) {
			userStub userStub = userGrpc.newStub(channel);
			userStub.getMesonetData(null, new mesonetCallback());
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
		while(true) {}
	}
	
	private static class mesonetCallback implements StreamObserver<MesonetDataList> {
		
        @Override
        public void onNext(MesonetDataList value) {
        	count++;  	
        	long end = System.currentTimeMillis();
            System.out.println("time taken to server "+count+" requests asynchronously : " + (end-start));
        }

        @Override
        public void onError(Throwable cause) {
            System.out.println("Error occurred, cause :"+cause.getMessage());
        }

        @Override
        public void onCompleted() {
        	
//            System.out.println("Stream completed for " + count);
        }
    }

}