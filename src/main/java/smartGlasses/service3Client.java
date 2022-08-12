package smartGlasses;

//required java packages for the program. Depends on your logic.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import smartGlasses.Service3Grpc.Service3BlockingStub;


//Client need not to extend any other class (GRPC related code) here 
public class service3Client {
	// First we create a logger to show client side logs in the console. logger instance will be used to log different events at the client console.
	// This is optional. Could be used if needed.
	private static  Logger logger = Logger.getLogger(service3Client.class.getName());

	// Creating stubs for establishing the connection with server.
	// Blocking stub
	private static Service3Grpc.Service3BlockingStub blockingStub;
	// Asynch stub
	private static Service3Grpc.Service3Stub asyncStub;
	
	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
	// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
		// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = Service3Grpc.newBlockingStub(channel);
		asyncStub = Service3Grpc.newStub(channel);

	
		// Closing the channel once message has been passed.		
		channel.shutdown();
	




	}
} //end of main class
