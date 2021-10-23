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
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).maxInboundMessageSize(99999999).usePlaintext().build();
		
		
		userStub userStub = userGrpc.newStub(channel);
		userStub userStub2 = userGrpc.newStub(channel);
		
//		long start = System.currentTimeMillis();
		
		try {
			start = System.currentTimeMillis();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("first");
		userStub.getMesonetData2(null, new mesonetCallback());
		System.out.println("Second");
		userStub2.getMesonetData2(null, new mesonetCallback());
		
//		long end = System.currentTimeMillis();
		
		 try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static class mesonetCallback implements StreamObserver<MesonetDataList> {
		
        @Override
        public void onNext(MesonetDataList value) {
        	
        	for(int i =0; i< value.getMesonetDataCount(); i++) {
//    			System.out.println(i + " "+value.getMesonetData(i).getStationID() + " "+ value.getMesonetData(i).getStationName());
    			
    		}
        	
        	long end = System.currentTimeMillis();
        	
//            System.out.println("end time " + System.currentTimeMillis());
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