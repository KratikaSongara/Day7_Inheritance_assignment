package com.ques2;

public class Hosteller extends Student{

	double hostelFee;
	
	public Hosteller() {
		
	}
	
	@Override
	public double payFee(double fee)
	{
		this.hostelFee=fee;
		int hostel = (int)hostelFee;
		int remaining = 1200000-hostel;
		return remaining;
	}
	

}
