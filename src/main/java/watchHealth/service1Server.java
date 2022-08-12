package watchHealth;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import watchHealth.Service1Grpc.Service1ImplBase;


import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;



public class service1Server extends Service1ImplBase {

	//creating a logger
	private static final Logger logger = Logger.getLogger(service1Server.class.getName());
	
	public static void main(String[] args) {
	
	service1Server oneServer= new service1Server();
	
	Properties prop = service1Server.getProperties();
	
	service1Server.registerService(prop);

	int port = Integer.valueOf( prop.getProperty("service_port") );
			
	try {
		
		  Server server = ServerBuilder.forPort(port)
	        .addService(oneServer) 
	        .build() 
	        .start(); 
    
			System.out.println("Service 1 Server started, listening on " + port);

			server.awaitTermination();
			

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
   

		
	} 
	
}
	
	private static Properties getProperties() {
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/service1.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("WatchHealth Service properties ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
		 
	}
	private static void registerService(Properties prop) {
		// TODO Auto-generated method stub
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "example";
	           // int service_port = 1234;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

	            
	            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}

	 @Override
	    public void stepQty(stepRequest request, StreamObserver<stepResponse> responseObserver) {
	       
		 //checking if the setp counter(pedometer) is active.
	        boolean actived = request.getStepStatus().getActived();

	        // the dog owner wishes to continue the step count from previous tracking
	        int currentCount = request.getStepStatus().getCount();

	        //Calculation is done on the average speed, here we dont have real sensor data so we hardcode
	        double avgSpeed = 3;
	        String result;

	        System.out.println("Pedometer Active: " + actived);
	        //if the collar is on properly and the pedometer is ready and active
//	        if(isActive){
	            try{
	                //begin the counting each second
	                for (int i = 0; i < 30; i+=4){
	                    result = "Current Steps: " + (currentCount + i);
	                    //calc avg speed
	                    avgSpeed += 0.01;
	                    stepResponse stepResponse = stepResponse.newBuilder()
	                            .setResult(result)
	                            .setAvgSpeed(avgSpeed)
	                            .build();
	                    responseObserver.onNext(stepResponse);
	                    Thread.sleep(1000);
	                }
	            }catch(InterruptedException e){
	                e.printStackTrace();
	            }finally {
	                responseObserver.onCompleted();
	            }	
		
	

		
		
	

	 }
	} //end of main class

