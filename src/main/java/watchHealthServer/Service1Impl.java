package watchHealthServer;

import java.time.LocalDateTime;
import java.util.Random;

import io.grpc.stub.StreamObserver;
import watchHealth.MovimentRequest;
import watchHealth.Service1Grpc.Service1ImplBase;
import watchHealth.StatusSedentary;


public class Service1Impl extends Service1ImplBase {

	@Override
	public void sedentaryReminder(MovimentRequest request, StreamObserver<StatusSedentary> responseObserver) {
		System.out.println("Receiving unary request from Client");
		String message = generateReplyMessage();		
		StatusSedentary reply = StatusSedentary.newBuilder().setMessagSedentary(message).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	private static String generateReplyMessage() {
		String message = "";
		
		// Simulate minutes without movement (max is 24 hours = 60*24)
		Random rand = new Random();
		int minutes = rand.nextInt(1440);				  
		
		LocalDateTime now = LocalDateTime.now();		
		
		// Sleeping time
		if (now.getHour() > 22 && now.getHour() < 6) {
			message = "Sleeping Mode: Sensors disabled!";
		} else {		   
			if (minutes > 60) {
				message = "Sedentary Alert! Time to get up and move.";
			} else {
				message = "Status OK: "+minutes+" minutes without moviment";
			}
		}
		
		return message;
	}

} 
