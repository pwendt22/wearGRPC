package watchSport;

import io.grpc.stub.StreamObserver;
import watchSport.Service2Grpc.Service2ImplBase;

public class WatchSportImpl extends Service2ImplBase{

	@Override
	public void running(runData request, StreamObserver<runAnalysis> responseObserver) {
		// TODO Auto-generated method stub
		super.running(request, responseObserver);
	}

	@Override
	public StreamObserver<sportData> sportMode(StreamObserver<sportAnalysis> responseObserver) {
		return new StreamObserver<sportData>() {
			@Override
			public void onNext(sportData request) {
				double theGoal = request.getTheGoal();
				String activity=request.getTypeActvity();
				int calories=calculateCalories(activity);
				double achieve=theGoal-request.getDuration();
				sportAnalysis response = sportAnalysis.newBuilder().setCaloriesBurned(calories).setTheGoal(achieve).build();			    
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
	 public static int calculateCalories(String activity) 
	    {
		 	int duration=0;
		 	int calories=0;
	    	if (activity.equals("Run") ) 
	    	{	calories=duration*5;
	    	} else {
	    		if (activity.equals("workout"))
	    			calories=duration*15;
	    	}
    		return calories;
	

		
	}
}

	

