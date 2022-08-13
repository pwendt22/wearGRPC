package watchHealthServer;

import java.io.IOException;
import JmDNS.SimpleServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;


public class Server1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//Defining a port
		int port = 8080;
		
		// jmDNS
		String service_type = "_WatchHealth._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);
		
		try {		
			Server server = ServerBuilder.forPort(port)
					.addService(new Service1Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}

/*
		
        Server server = ServerBuilder.forPort(port).addService(new Service1Impl()).build();
        System.out.println("Server Starting");
        server.start();
        System.out.println("Server Started");
        server.awaitTermination();      		
	}
  }

*/

