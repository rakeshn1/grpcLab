package Service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.cmpe275.lab1.User.AllData;
import com.cmpe275.lab1.User.Empty;
import com.cmpe275.lab1.User.MesonetData;
import com.cmpe275.lab1.User.MesonetDataList;
import com.cmpe275.lab1.User.StationRequest;
import com.cmpe275.lab1.User.Weather;
import com.cmpe275.lab1.User.Weather.Builder;
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
		MesonetProcessor fetcher = new MesonetProcessor();	
		data = fetcher.parseData();
	}

	@Override
	public void getMesonetData(Empty request, StreamObserver<MesonetDataList> responseObserver) {

		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		Runnable r = () -> {
			try {

				System.out.println("request started at : " + port);
				MesonetDataList.Builder dataListBuilder = MesonetDataList.newBuilder();
				
				for (int i=0; i<10;i++) {
				for (gash.obs.madis.MesonetData d : data) {
					MesonetData.Builder dataBuilder = MesonetData.newBuilder();
					dataBuilder.setStationID(d.getStationID());
					dataBuilder.setStationName(d.getStationName());
					dataBuilder.setStationType(d.getStationType());
					dataListBuilder.addMesonetData(dataBuilder);
				}
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

	@Override
	public void getTopTen(Empty request, StreamObserver<MesonetDataList> responseObserver) {
		System.out.println("request started at : " + port);
		MesonetDataList.Builder dataListBuilder = MesonetDataList.newBuilder();
		for (int i=0;i<10;i++) {
			MesonetData.Builder dataBuilder = MesonetData.newBuilder();
			dataBuilder.setStationID(data.get(i).getStationID());
			dataBuilder.setStationName(data.get(i).getStationName());
			dataBuilder.setStationType(data.get(i).getStationType());
			dataListBuilder.addMesonetData(dataBuilder);
		}
		MesonetDataList mesonetDataList = dataListBuilder.build();
		responseObserver.onNext(mesonetDataList);
		responseObserver.onCompleted();
		System.out.println("ended");
	}

	@Override
	public void getWeather(StationRequest request, StreamObserver<Weather> responseObserver) {
		String stationId = request.getStationID();
		Weather.Builder weatherObject = Weather.newBuilder();
		for (gash.obs.madis.MesonetData d : data) {
			if(d.getStationID().equals(stationId)) {
				weatherObject.setAltimeter(d.getAltimeter());
				weatherObject.setDewpoint(d.getDewpoint());
				weatherObject.setRelHumidity(d.getRelHumidity());
				weatherObject.setSeaLevelPress(d.getSeaLevelPress());
				weatherObject.setStationPressure(d.getStationPressure());
				weatherObject.setTemperature(d.getTemperature());
				weatherObject.setTemperatureQC(d.getTemperatureQC());
				break;
			}
		}
		responseObserver.onNext(weatherObject.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getAllData(Empty request, StreamObserver<AllData> responseObserver) {
		AllData.Builder allData = AllData.newBuilder();
	}
	
	
	
	
}
