package WatchHealthClient;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import watchHealth.MovimentRequest;
import watchHealth.Service1Grpc;
import watchHealth.Service1Grpc.Service1BlockingStub;
import watchHealth.StatusSedentary;
import JmDNS.SimpleServiceDiscovery;
import javax.jmdns.ServiceInfo;





public class Client1 {
    private static Service1BlockingStub bStub;   
	
	public static void main(String[] args) throws InterruptedException {
		//files based on class's files
		
		// JmDNS
			ServiceInfo serviceInfo;
			String service_type = "_WatchHealth._tcp.local.";
			String service_name = "GrpcServer";
			serviceInfo = SimpleServiceDiscovery.run(service_type);
				
				// port & host
				int port = 8080;
				String host = "localhost";
						
		    	// build a channel
				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host , port)
						.usePlaintext()
						.build();
				
				// stub
				bStub = Service1Grpc.newBlockingStub(channel);
				
				MovimentRequest request = MovimentRequest.newBuilder().build();
				StatusSedentary Response = bStub.sedentaryReminder(request);
				JOptionPane.showMessageDialog(null,Response.getMessagSedentary());
				
				System.out.println("Shutting down channel");
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
				}
			
}