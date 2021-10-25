package Service;

public class AddWork {
	
	public static void main(String[] args) throws InterruptedException {
		
//		for(int i=0;i<100;i++) {			
//			ClientTrigger.addWork();
//		}
//		while(ClientTrigger.hasWork()) {
//			Thread.sleep(1000);
//		}
		
		AsyncGrpcClientLoadBalancer loadBalancer = new AsyncGrpcClientLoadBalancer();
		
		for(int i=0; i<10; i++) {			
			loadBalancer.addWork();
		}
		
		while(loadBalancer.hasWork()) {
			Thread.sleep(1000);
		}
		
	}
}