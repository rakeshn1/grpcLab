package Service;

import com.cmpe275.lab1.userGrpc;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SyncGrpcClient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).maxInboundMessageSize(999999999).usePlaintext().build();
		
		
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		
		long start = System.currentTimeMillis();
		
		
		MesonetDataList mesonetData = userStub.getMesonetData2(null);
//		for(int i = 0 ; i< 100;i++) {
//			System.out.println(mesonetData.getMesonetData(i));
//		}
		System.out.println("first done" );
		MesonetDataList mesonetData2 = userStub.getMesonetData2(null);
		
//		for(int i = 0 ; i< 100;i++) {
//			System.out.println(mesonetData2.getMesonetData(i));
//		}
		
		long end = System.currentTimeMillis();
		System.out.println("time taken : " + (end-start));
		
		
		
	}

}