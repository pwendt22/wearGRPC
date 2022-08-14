package AvgHeartBeat;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import AvgHeartBeat.AvgHeartBeatGrpc.AvgHeartBeatImplBase;
import JmDNS.SimpleServiceRegistration;


public class Service4_server extends AvgHeartBeatImplBase {

	public static void main(String[] args) {
		Service4_server server4 = new Service4_server();

    	System.out.println("Starting gRPC AvgHeartBeat service server.");
    	
    	//Define the port
		int port = 8084;
		
		// jmDNS
		String service_type = "_HeartBeat._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					
					//Implementing the interface
					.addService(new Service4_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}