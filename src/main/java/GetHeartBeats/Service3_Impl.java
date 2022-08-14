package GetHeartBeats;

import GetHeartBeats.GetHeartBeatsGrpc.GetHeartBeatsImplBase;
import io.grpc.stub.StreamObserver;

public class Service3_Impl extends GetHeartBeatsImplBase {
	//Server Streaming
    public void GetHeartBeats(BeatsServerStreamRequest request, StreamObserver<BeatsResponse> responseObserver)
    {       try
            {   int measures = request.getMeasure();
                int interval = request.getIntervalB();
                for(int i = 0; i < measures; i++)
                {   BeatsResponse response = BeatsResponse.newBuilder().setBeatH(randomRate(20, 220)).build();
                    responseObserver.onNext(response);
                    Thread.sleep(interval * 1000L);
                }
                } catch (InterruptedException e)
                {  e.printStackTrace(); }
                finally { 
                        responseObserver.onCompleted();
                }
    }
    //Random method to generate heart rate.
    public static double randomRate(double min, double max)
    {   double BeatH = (Math.random()*((max-min)+1))+min;
        return BeatH;
    }
}
