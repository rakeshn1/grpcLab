package Service;

import java.net.InetSocketAddress;

import com.cmpe275.lab1.userGrpc;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;

public class SyncGrpcClient {

	public static void main(String[] args) {
		
		NameResolver.Factory nameResolverFactory = new MultiNameResolver(
	            new InetSocketAddress("localhost", 9000),
	            new InetSocketAddress("localhost", 9001)
	    );

		ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost").nameResolverFactory(nameResolverFactory)
				.defaultLoadBalancingPolicy("round_robin").maxInboundMessageSize(1024 * 1024 * 1024).usePlaintext()
				.build();
		
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<5000;i++) {
			userStub.getMesonetData(null);
			System.out.println("Total time taken for serving "+ i +  " requests synchronously: " + (System.currentTimeMillis()-start));
			
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken : " + (end-start));
		
		
		
	}

}