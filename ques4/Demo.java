package com.ques4;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
			AxisBank axis = new AxisBank();
			axis.branchName="Axis";
			axis.IfscCode="12546785443";
			axis.rateOfInterest=6.8;
			return axis;
		}
		 
		else if(bank.equals("icici")) {
			ICICIBank icici = new ICICIBank();
			icici.branchName="ICICI";
			icici.IfscCode="9899876876";
			icici.rateOfInterest=7.1;
			return icici;
		}
		
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter bank name");
		Scanner sc = new Scanner(System.in);
		String bank = sc.next();
		
		Bank name=getBank(bank);
		if(name instanceof AxisBank)
		{
			name.displayDetails();
		}
		else if(name instanceof ICICIBank)
		{
			name.displayDetails();
		}
		
	}

}
