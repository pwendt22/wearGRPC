package smartGlasses;


//required java packages for the program. Depends on your logic.
import java.io.IOException;
import java.util.logging.Logger;

//required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;


//This is ImplBase class that was generated from the proto file.
//You need to change this location for your projects. NOTICE: The class is in StringsServiceGrpc.java -> StringsServiceImplBase class (this Base class is generated from proto file option java_outer_classname)
import smartGlasses.Service3Grpc.Service3ImplBase;


//Extend the ImplBase imported class here. It is an Interface file with required rpc methods
public class service3Server extends Service3ImplBase {

//First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
	private static final Logger logger = Logger.getLogger(service3Server.class.getName());

//Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
//NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
	 public static void main(String[] args) throws IOException, InterruptedException {
		    
		 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
		 service3Server service3server = new service3Server();

		 	// This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking) 
		    int port = 50055;
		    
		    // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
		    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
		        .addService(service3server) // Service is defined in line 31
		        .build() // Build the server
		        .start(); // Start the server and keep it running for clients to contact.
		    
		    // Giving a logging information on the server console that server has started
		    logger.info("Server started, listening on " + port);
		    		    
		    // Server will be running until externally terminated.
		    server.awaitTermination();
	 }
	
	
}


	
	
