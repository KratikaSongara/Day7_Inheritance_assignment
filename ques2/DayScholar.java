package com.ques2;

public class DayScholar extends Student{

	double transportFee;
	
	public DayScholar() {
		
	}
	
	@Override
	public double payFee(double fee)
	{
		this.transportFee=fee;
		int transport = (int)transportFee;
		int remaining = 1200000-transport;
		return remaining;
	}
	

}
