package GetHeartBeats;



import AvgHeartBeat.Service4_Impl;
import GetHeartBeats.GetHeartBeatsGrpc.GetHeartBeatsImplBase;
import JmDNS.SimpleServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Service3_server extends GetHeartBeatsImplBase {

	public static void main(String[] args) {
		Service3_server server3 = new Service3_server();

    	System.out.println("Starting gRPC GetHeartBEats service server.");
    	
    	//Define the port
		int port = 8089;
		
		// jmDNS
		String service_type = "_GetHeartBeats._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					
					//Implementing the interface
					.addService(new Service3_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}