package HeartStatus;

import HeartStatus.HeartStatusGrpc.HeartStatusImplBase;
import io.grpc.stub.StreamObserver;

public class Service2_Impl extends HeartStatusImplBase {
	@Override
    public StreamObserver<StatusRequest> heartStatus(StreamObserver<StatusResponse> responseObserver) {
    	return new StreamObserver<StatusRequest>() {
			@Override
			public void onNext(StatusRequest request) {
				double heartBeats = request.getBeats();
				String rate = getStatusClassification(heartBeats);
				StatusResponse response = StatusResponse.newBuilder()
						.setClassif(rate).build();			    
                responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();				
			}
		};
    }
	public static String getStatusClassification(double Beats) 
    {
    	if (Beats < 75) 
    	{	return "Very relaxed";
    	} else if (Beats < 100) 
    	{	return "relaxed";
    	} else if (Beats < 125) 
    	{	return "on moviment";
    	} else if (Beats < 150) 
    	{	return "Slow Down";
    	} else if (Beats < 175) 
    	{	return "Becareful, heart rate high";
    	} else 
    	{	return "Problem!";
    	}  
    }

}
