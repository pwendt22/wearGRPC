package AvgHeartBeat;

import AvgHeartBeat.AvgHeartBeatGrpc.AvgHeartBeatImplBase;
import io.grpc.stub.StreamObserver;

public class Service4_Impl extends AvgHeartBeatImplBase {

		public StreamObserver<GetHeartBeatRequest> getHeartBeatsAverage(StreamObserver<GetHeartBeatResponse> responseObserver) {
	        StreamObserver<GetHeartBeatRequest> requestObserver = new StreamObserver<GetHeartBeatRequest>()
	        {
	            int sum = 0;
	            int count = 0;
	            @Override
	            public void onNext(GetHeartBeatRequest value)
	            {   
	                sum = sum + value.getNumberQual();
	               
	                count ++;
	            }
	            @Override
	            public void onError(Throwable t)
	            {            }
	            @Override
	            public void onCompleted()
	            {   double average = (double) sum/count;
	                responseObserver.onNext(GetHeartBeatRequest.newBuilder().setavgHeart(average)).build());
	                responseObserver.onCompleted();
	            }
	        };
	        return requestObserver;
	    }

	}
	

