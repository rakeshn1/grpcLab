package Service;

import java.util.List;

import gash.obs.madis.MesonetData;
import gash.obs.madis.MesonetProcessor;

public class FetchData {
	public static void main(String[] args) {
		System.out.println("working");
		MesonetProcessor fetcher = new MesonetProcessor();	
//		
		List<MesonetData> a = fetcher.parseData();
	}

}
