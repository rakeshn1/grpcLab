package Service;

import java.util.List;
import java.util.Random;

import com.cmpe275.lab1.User.APIResponse;
import com.cmpe275.lab1.User.Empty;
import com.cmpe275.lab1.User.LoginRequest;
import com.cmpe275.lab1.User.MesonetData;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userImplBase;

import gash.obs.madis.MesonetProcessor;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase {
	
	
	private final String name; 
	private final int port; 
	private List<gash.obs.madis.MesonetData>  data;
	
	
	public UserService(String name,int port) {
		this.port = port;
		this.name = name;
		MesonetProcessor fetcher = new MesonetProcessor();	
		data = fetcher.parseData();
	}


	@Override
	public void getMesonetData(Empty request, StreamObserver<MesonetDataList> responseObserver) {
	
		System.out.println("request started at : " + port);
		MesonetDataList.Builder dataListBuilder = MesonetDataList.newBuilder();
//		
//		for (gash.obs.madis.MesonetData d : data) {
//			MesonetData.Builder dataBuilder = MesonetData.newBuilder();
//			dataBuilder.setStationID(d.getStationID());
//			dataBuilder.setStationName(d.getStationName());
//			dataBuilder.setStationType(d.getStationType());
//			dataListBuilder.addMesonetData(dataBuilder);
//		}
		
		for (int i=0; i<10;i++) {
			MesonetData.Builder dataBuilder = MesonetData.newBuilder();
			dataBuilder.setStationID("id");
			dataBuilder.setStationName("name");
			dataBuilder.setStationType("type");
			dataListBuilder.addMesonetData(dataBuilder);
		}
		
		responseObserver.onNext(dataListBuilder.build());
		responseObserver.onCompleted();
		System.out.println("ended");
	}
	
	
}
