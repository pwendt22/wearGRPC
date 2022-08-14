package watchSport;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import watchHealth.MovimentRequest;
import watchHealth.Service1Grpc;
import watchHealth.Service1Grpc.Service1BlockingStub;
import watchHealth.StatusSedentary;
import JmDNS.SimpleServiceDiscovery;
import javax.jmdns.ServiceInfo;





public class Service2Client {
   
	
	public static void main(String[] args) throws InterruptedException {
		//files based on class's files
		
		// JmDNS
			ServiceInfo serviceInfo;
			String service_type = "_WatchSport._tcp.local.";
			String service_name = "GrpcServer";
			serviceInfo = SimpleServiceDiscovery.run(service_type);
				
				// port & host
				int port = 8081;
				String host = "localhost";
						
		    	// build a channel
				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host , port)
						.usePlaintext()
						.build();
				
				doBidirectionalCall(channel);
				
				System.out.println("Shutting down channel");
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
				
				//Bidirectional
			    public static void doBidirectionalCall(ManagedChannel channel) {
			    	System.out.println("Starting bidirectional streaming...");
			        Service2Grpc.Service2Stub stub = Service2Grpc.newStub(channel);
					CountDownLatch latch = new CountDownLatch(1);

					StreamObserver<sportData> requestObserver =
						stub.sportMode(new StreamObserver<sportAnalysis>() {
							@Override
							public void onNext(sportAnalysis response) {		
								System.out.println("Response from server: "+response);
							}

							@Override
							public void onError(Throwable t) {
							}

							@Override
							public void onCompleted() {
								latch.countDown();
							}
						});
					
					for (int i=0; i<5; i++) 
					{
			        	
			        	System.out.println("Sending request "+ i +" to server...");
			            requestObserver.onNext(sportData.newBuilder()
			            		.setDuration(i).setTheGoal(15).setTypeActvity("Run").build());
			        }    
					requestObserver.onCompleted();
					try {
						latch.await(3, TimeUnit.SECONDS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					channel.shutdownNow();
			    }
			    
			    public static int createRandomNumber(int min, int max) {
			    	Random random = new Random();
			    	int number = random.nextInt(max+1)+min;
			    	return number;
			    }
			

				
			
				}
			
