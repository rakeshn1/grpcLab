package Service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.cmpe275.lab1.User.Empty;
import com.cmpe275.lab1.User.MesonetData;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.userGrpc.userImplBase;

import gash.obs.madis.MesonetProcessor;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase {

	private final String name;
	private final int port;
	private List<gash.obs.madis.MesonetData> data;

	public UserService(String name, int port) {
		this.port = port;
		this.name = name;
//		MesonetProcessor fetcher = new MesonetProcessor();	
//		data = fetcher.parseData();
	}

	@Override
	public void getMesonetData(Empty request, StreamObserver<MesonetDataList> responseObserver) {

		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		Runnable r = () -> {
			try {

				MesonetProcessor fetcher = new MesonetProcessor();
				data = fetcher.parseData();

				System.out.println("request started at : " + port);
				MesonetDataList.Builder dataListBuilder = MesonetDataList.newBuilder();
//				
				for (gash.obs.madis.MesonetData d : data) {
					MesonetData.Builder dataBuilder = MesonetData.newBuilder();
					dataBuilder.setStationID(d.getStationID());
					dataBuilder.setStationName(d.getStationName());
					dataBuilder.setStationType(d.getStationType());
					dataListBuilder.addMesonetData(dataBuilder);
				}

				MesonetDataList mesonetDataList = dataListBuilder.build();

				responseObserver.onNext(mesonetDataList);
				responseObserver.onCompleted();
				System.out.println("ended");

			} catch (Exception e) {
				responseObserver.onError(e);
			}

		};
		executorService.schedule(r, 0, TimeUnit.MILLISECONDS);

	}

	@Override
	public void getMesonetDataStream(Empty request, StreamObserver<MesonetDataList> responseObserver) {

		MesonetProcessor fetcher = new MesonetProcessor();
		data = fetcher.parseData();

		System.out.println("request started at : " + port);
		MesonetDataList.Builder dataListBuilder = MesonetDataList.newBuilder();
		for (gash.obs.madis.MesonetData d : data) {
			MesonetData.Builder dataBuilder = MesonetData.newBuilder();
			dataBuilder.setStationID(d.getStationID());
			dataBuilder.setStationName(d.getStationName());
			dataBuilder.setStationType(d.getStationType());
			dataListBuilder.addMesonetData(dataBuilder);
			
			MesonetDataList mesonetDataList = dataListBuilder.build();
			responseObserver.onNext(mesonetDataList);
			
		}

		responseObserver.onCompleted();
		
		System.out.println("ended");

	}

}
