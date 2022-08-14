package HeartStatus;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import HeartStatus.HeartStatusGrpc.HeartStatusImplBase;
import JmDNS.SimpleServiceRegistration;
public class Service2_server extends HeartStatusImplBase {

	public static void main(String[] args) {
		Service2_server server2 = new Service2_server();

    	System.out.println("Starting gRPC HeartStatus service server.");
    	
    	//Define the port
		int port = 8088;
		
		// jmDNS
		String service_type = "_HeartStatus._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					
					//Implementing the interface
					.addService(new Service2_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}