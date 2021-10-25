package Service;

public class ClientTrigger {
	
	private static AsyncGrpcClientLoadBalancer loadBalancer = new AsyncGrpcClientLoadBalancer();

//	public static void main(String[] args) {
//		
//		while(true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
	
	public static void addWork() {
		loadBalancer.addWork();
	}
	
	public static boolean hasWork() {
		return loadBalancer.hasWork();
	}
	
}