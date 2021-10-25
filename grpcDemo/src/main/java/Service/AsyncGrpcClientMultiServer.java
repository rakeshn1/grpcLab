package Service;

import com.cmpe275.lab1.userGrpc;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import io.grpc.NameResolverRegistry;
import io.grpc.stub.StreamObserver;

public class AsyncGrpcClientMultiServer {

	private static long start;
	private static long count = 0;

	public static void main(String[] args) {
		

		ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 9000).maxInboundMessageSize(1024 * 1024 * 1024).usePlaintext()
				.build();
		
		ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 9001)
				.maxInboundMessageSize(1024 * 1024 * 1024).usePlaintext()
				.build();
		
		ManagedChannel channel3 = ManagedChannelBuilder.forAddress("localhost", 9002)
				.maxInboundMessageSize(1024 * 1024 * 1024).usePlaintext()
				.build();
		
		userStub userStub1 = userGrpc.newStub(channel1);
		userStub userStub2 = userGrpc.newStub(channel2);
		userStub userStub3 = userGrpc.newStub(channel3);
		List<userStub> userStubs = new ArrayList<userStub> ();
		userStubs.add(userStub1);
		userStubs.add(userStub2);
		userStubs.add(userStub3);
		

		try {
			System.out.println("started");
			start = System.currentTimeMillis();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		int j = 0;
		for (int i = 0; i < 5000; i++) {
			userStubs.get(j%3).getMesonetData(null, new mesonetCallback());
			j++;
		}

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
			count++;
			long end = System.currentTimeMillis();
			System.out.println("time taken to server " + count + " requests asynchronously : " + (end - start));
		}

		@Override
		public void onError(Throwable cause) {
			System.out.println("Error occurred, cause :" + cause.getMessage());
		}

		@Override
		public void onCompleted() {

//            System.out.println("Stream completed for " + count);
		}
	}

}