package jj5;

public class MissedCall {
	
			//String name;
			double time;
			int number;
			

	public MissedCall() {
		time=0.0;
		number=0;
	}

	public MissedCall(double t,int n) {
		//name=na;
		time=t;
		number=n;
	}
	
	public String toString() {
		return "\nTime: "+time+"\nNumber: "+number;
	}

}
