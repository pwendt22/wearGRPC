package GetHeartBeats;


import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import JmDNS.SimpleServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class Server3_client {   
	
	public static void main(String[] args) throws InterruptedException {
		//files based on class's files
		
		// JmDNS
			ServiceInfo serviceInfo;
			String service_type = "_GetHeartBeats._tcp.local.";
			String service_name = "GrpcServer";
			serviceInfo = SimpleServiceDiscovery.run(service_type);
				
				// port & host
				int port = 8089;
				String host = "localhost";
						
		    	// build a channel
				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host , port)
						.usePlaintext()
						.build();
				
				
				doServerStreamingCall(channel);
				
				System.out.println("Shutting down channel");
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	
	
	//Server Streaming method
	
    private static void doServerStreamingCall(ManagedChannel channel)
    {   
    	int measure = 5;
    	int intervalB = 4;
    	System.out.println("Starting server streaming...");
    	System.out.println("Quantity of measures: "+ measure);
    	System.out.println("Interval between measures (seconds): "+intervalB);
    	GetHeartBeatsGrpc.GetHeartBeatsBlockingStub stub = GetHeartBeatsGrpc.newBlockingStub(channel);
        //preparing the request
    	BeatsServerStreamRequest request = BeatsServerStreamRequest.newBuilder()
                .setMeasure(measure)
               .setIntervalB(intervalB) //seconds
                .build();
        //streaming the responses
        stub.getHeartBeats(request).forEachRemaining(response -> {
        	
            //print for each response
            System.out.println("Response from server: "+response);
        });
    }
}