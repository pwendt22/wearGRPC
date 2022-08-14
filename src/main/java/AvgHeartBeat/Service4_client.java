package AvgHeartBeat;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import AvgHeartBeat.AvgHeartBeatGrpc.AvgHeartBeatStub;
import GetHeartBeats.GetHeartBeatsGrpc;
import GetHeartBeats.GetHeartBeatsGrpc.GetHeartBeatsStub;
import JmDNS.SimpleServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class Service4_client {   
	
	public static void main(String[] args) throws InterruptedException {
		//files based on class's files
		
		// JmDNS
			ServiceInfo serviceInfo;
			String service_type = "_HeartBeat._tcp.local.";
			String service_name = "GrpcServer";
			serviceInfo = SimpleServiceDiscovery.run(service_type);
				
				// port & host
				int port = 8084;
				String host = "localhost";
						
		    	// build a channel
				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host , port)
						.usePlaintext()
						.build();
				doClientStreamingCall(channel);
				
				System.out.println("Shutting down channel");
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	
	
				//Client Streaming
			    private static void doClientStreamingCall(ManagedChannel channel)
			    {   //synchronous >> //SmartwatchServiceGrpc.SmartwatchServiceBlockingStub stub = SmartwatchServiceGrpc.newBlockingStub(channel);
			        //asynchronous client
			    	System.out.println("Starting client streaming...");
			    	AvgHeartBeatStub asyncClient = AvgHeartBeatGrpc.newStub(channel);
			        CountDownLatch latch = new CountDownLatch(1);
			        StreamObserver<GetHeartBeatRequest> requestObsever = asyncClient.avgHeartBeat(new StreamObserver<GetHeartBeatResponse>() {
			            @Override
			            public void onNext(GetHeartBeatResponse value)
			            {
			                System.out.println("Received a response from the server.");
			                System.out.println("The average Heart Beats is: "+value.getAvgHeart());
			            }
			            @Override
			            public void onError(Throwable t)
			            {            }
			            @Override
			            public void onCompleted()
			            {                
			                latch.countDown();
			            }
			        });
			        for (int i=0; i<5; i++) 
			        {
			        	int number = createRandomNumber(60, 190);
			        	System.out.println("Sending HearBeat "+number+" to server...");        	
			            requestObsever.onNext(GetHeartBeatRequest.newBuilder()
			            		.setNumberQual(number).build());
			        }        
			        requestObsever.onCompleted();        
			        try {
			            latch.await(3, TimeUnit.SECONDS);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			    }
			    public static int createRandomNumber(int min, int max) {
			    	Random random = new Random();
			    	int number = random.nextInt(max+1)+min;
			    	return number;
			    }
			}