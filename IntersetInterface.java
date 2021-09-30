package com.oops;

interface Interest {
	void callInterest();
	  float principle=10,noofyears=1,rateofinterest=2;
}

public class IntersetInterface {
	
	public static void main(String[] args){
		  Interest amount=new SimpleInterest(1500,12,1);
		  amount.callInterest();
		  Interest amount1=new CompoundInterest(150,1,1,2);
		  amount1.callInterest();
		}
}




class CompoundInterest implements Interest{
	float principle,noofyears,rateofinterest,timeperiod;
		  CompoundInterest(float principle,float noofyears,float rateofinterest,float timeperiod){
		    this.principle=principle;
		    this.noofyears=noofyears;
		    this.rateofinterest=rateofinterest;
		    this.timeperiod=timeperiod;
		  }
		double compoundinterest;
		@Override
		public void callInterest(){
			compoundinterest=(principle*Math.pow(1+(rateofinterest/noofyears),noofyears*timeperiod))-principle;
			System.out.println("Compound Interset is "+compoundinterest);
		}
}




class SimpleInterest implements Interest{
	float principle,noofyears,rateofinterest;
			  SimpleInterest(float principle,float noofyears,float rateofinterest){
			    this.principle=principle;
			    this.noofyears=noofyears;
			    this.rateofinterest=rateofinterest;
			  }
		float simpleinterest;
		@Override
		public void callInterest(){
			simpleinterest=(principle*noofyears*rateofinterest)/100;
			System.out.println("Simple Interset is "+simpleinterest);
		}
}
