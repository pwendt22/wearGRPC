package WatchHealthClient;

import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import watchHealth.MovimentRequest;
import watchHealth.Service1Grpc;
import watchHealth.StatusSedentary;
import JmDNS.SimpleServiceDiscovery;
import javax.jmdns.ServiceInfo;





public class Client1 {
	
	public static void main(String[] args) throws InterruptedException {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        Service1Grpc.Service1BlockingStub stub = Service1Grpc.newBlockingStub(channel); 
		
  
		// jmdns
		ServiceInfo serviceInfo;
		String service_type = "_watchHealth._tcp.local.";
		serviceInfo = SimpleServiceDiscovery.run(service_type); 
		
		
        // (RPC)
        StatusSedentary respostaDoServidor = stub.sedentaryReminder(MovimentRequest.newBuilder().build());

        JOptionPane.showMessageDialog(null, respostaDoServidor.getMessagSedentary());
        System.out.println("Shutting down channel");
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

}
