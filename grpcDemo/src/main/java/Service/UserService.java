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
	
	private List<gash.obs.madis.MesonetData> data;
	
	
	public UserService() {
		
		MesonetProcessor fetcher = new MesonetProcessor();	
		data = fetcher.parseData();
		
		
	}
	

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside login");

		String username = request.getUsername();
		String password = request.getPassword();

		APIResponse.Builder response = APIResponse.newBuilder();
		if (username.equals(password)) {

			// return success message	

			response.setResponseCode(0).setResponsemessage("SUCCESS");	

		} else {
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}
		Random _rand = new Random(System.nanoTime());
		try {
			Thread.sleep(_rand.nextInt(5000) + 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}


	@Override
	public void getMesonetData(Empty request, StreamObserver<MesonetDataList> responseObserver) {
	
		MesonetDataList.Builder dataListBuilder = MesonetDataList.newBuilder();
		
		
		for (gash.obs.madis.MesonetData d : data) {
			MesonetData.Builder dataBuilder = MesonetData.newBuilder();
			dataBuilder.setStationID(d.getStationID());
			dataBuilder.setStationName(d.getStationName());
			dataBuilder.setStationType(d.getStationType());
			dataListBuilder.addMesonetData(dataBuilder);
		}
		
		
		
		responseObserver.onNext(dataListBuilder.build());
		responseObserver.onCompleted();
	}

//	@Override
//	public void getMesonetData(Empty request, StreamObserver<MesonetData> responseObserver) {
//		
//		
//		
//		MesonetData.Builder dataBuilder = MesonetData.newBuilder();
//		
//		
//		
//		dataBuilder.setStationID(data.get(0).getStationID());
//		dataBuilder.setStationName(data.get(0).getStationName());
//		dataBuilder.setStationType(data.get(0).getStationType());
//		
//		responseObserver.onNext(dataBuilder.build());
//		responseObserver.onCompleted();
//		
//	}
	

}
