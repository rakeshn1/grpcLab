package Service;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
	public static void main(String args[]) throws IOException, InterruptedException {

		final int servers = 3;
		ExecutorService executorService = Executors.newFixedThreadPool(servers);
		for (int i = 0; i < servers; i++) {
			String name = "Server_" + i;
			int port = 9000 + i;
			executorService.submit(() -> {
				try {
					startServer(name, port);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}

	}

	private static void startServer(String name, int port) throws IOException, InterruptedException {
		System.out.println("starting GRPC Server");
		Server server = ServerBuilder.forPort(port).addService(new UserService(name,port)).build();
		server.start();
		System.out.println("server started at " + server.getPort());
		server.awaitTermination();

	}
}
