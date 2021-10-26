package Service;

import com.cmpe275.lab1.userGrpc;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import io.grpc.NameResolverRegistry;
import io.grpc.stub.StreamObserver;

public class AsyncGrpcClient {

	private static long start;
	private static long count = 0;

	public static void main(String[] args) {
		

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000).maxInboundMessageSize(1024 * 1024 * 1024).executor(Executors.newFixedThreadPool(3)).usePlaintext()
				.build();
		
		userStub userStub = userGrpc.newStub(channel);
		

		try {
			start = System.currentTimeMillis();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		int j = 0;
		for (int i = 0; i < 10; i++) {
//			userStubs.get(j%3).getMesonetData(null, new mesonetCallback());
//			j++;
			userStub.getMesonetData(null, new mesonetCallback());
//			userStub.getMesonetData(null, new mesonetCallback());
		}

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static class mesonetCallback implements StreamObserver<MesonetDataList> {

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