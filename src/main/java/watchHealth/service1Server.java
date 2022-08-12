package watchHealth;

import java.io.IOException;
import java.util.Iterator;
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
	
	public static void main(String[] args) throws IOException, InterruptedException {
	System.out.println("This is the Server 1");
	
	service1Server oneServer= new service1Server();
	
	int port = 50057;
    Server server = ServerBuilder.forPort(port)
	        .addService(oneServer) 
	        .build() 
	        .start(); 
    
    // Giving a logging information on the server console that server has started
    logger.info("Server started, listening on " + port);
    
 // Server will be running until externally terminated.
    server.awaitTermination();

    //server streaming
	
		
	} //end of the method
	
} //end of main class
