package Service;

import com.cmpe275.lab1.userGrpc;

import java.util.ArrayList;
import java.util.List;

import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AsyncGrpcClientLoadBalancer {

	private static long start;
	private static int count = 0, balancer=0;
	private boolean _forever = true;
	private final static Integer _mutex = Integer.valueOf(1);
	private List<userStub>  userStubs;
	
	private int servers = 3;
	
	public AsyncGrpcClientLoadBalancer() {
		userStubs = new ArrayList<userStub>();
		for(int i = 0; i<servers; i++) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000 + i).maxInboundMessageSize(1024 * 1024 * 1024).usePlaintext()
					.build();
			userStub userStub = userGrpc.newStub(channel);
			userStubs.add(userStub);
		}
	}
	public void stopClient() {
		_forever = false;
	}
	
	public void addWork() {
		balancer++;
		count++;
		userStubs.get(balancer%3).getMesonetData(null, new mesonetCallback());
	}
	
	public boolean hasWork() {
		System.out.println(count);
		if(count > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	private static void decrement() {
		synchronized(_mutex) {
			count--;
		}
	}

	private static class mesonetCallback implements StreamObserver<MesonetDataList> {
		@Override
		public void onNext(MesonetDataList value) {
			decrement();
			long end = System.currentTimeMillis();
			System.out.println("time taken to server " + count + " requests asynchronously : " + (end - start));
		}

		@Override
		public void onError(Throwable cause) {
			decrement();
			System.out.println("Error occurred, cause :" + cause.getMessage());
		}

		@Override
		public void onCompleted() {
//            System.out.println("Stream completed for " + count);
		}
	}

}