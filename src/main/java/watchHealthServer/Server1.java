package watchHealthServer;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Server1 {
	public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new Service1Impl()).build();
        System.out.println("Server Starting");
        server.start();
        System.out.println("Server Started");
        server.awaitTermination();
    }

}