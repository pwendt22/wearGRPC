package watchSport;


	import java.io.IOException;
	import JmDNS.SimpleServiceRegistration;
	import io.grpc.Server;
	import io.grpc.ServerBuilder;

	public class Service2Server {
		public static void main(String[] args) throws IOException, InterruptedException {
			
			
			//Defining a port
			int port = 8081;
			
			// jmDNS
			String service_type = "_WatchSport._tcp.local.";
			String service_name = "GrpcServer";
			SimpleServiceRegistration ssr = new SimpleServiceRegistration();
			ssr.run(port, service_type, service_name);
			
			try {		
				Server server = ServerBuilder.forPort(port)
						.addService(new WatchSportImpl())
						.build()
						.start();
				System.out.println("Server started, listening on " + port);
				server.awaitTermination();
			} catch (Exception e) {
				System.out.println(e);
			}		
		}
	}



