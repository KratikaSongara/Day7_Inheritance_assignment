package com.ques2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar scholar = new DayScholar();
		Hosteller hosteller = new Hosteller();
		
		double scholar_fee=scholar.payFee(20000.00);
		System.out.println("Scholar-Fee : "+scholar_fee);
		
		double hosteller_fee = hosteller.payFee(50000.00); 
		System.out.println("Hosteller-Fee : "+hosteller_fee);
	}

}
