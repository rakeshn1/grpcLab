package Service;

import com.cmpe275.lab1.userGrpc;
import com.cmpe275.lab1.User.APIResponse;
import com.cmpe275.lab1.User.LoginRequest;
import com.cmpe275.lab1.User.MesonetData;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).maxInboundMessageSize(99999999).usePlaintext().build();
		
		
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		
		long start = System.currentTimeMillis();
		
		
		MesonetDataList mesonetData = userStub.getMesonetData(null);
		for(int i =0; i< mesonetData.getMesonetDataCount(); i++) {
			System.out.println(i + " "+mesonetData.getMesonetData(i).getStationID() + " "+ mesonetData.getMesonetData(i).getStationName());
			
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken : " + (end-start));
		
		
		
	}

}