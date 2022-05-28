package com.ques1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.name = "Rahul";
		employee.Age = 27;
		employee.Phone_number="1234568798";
		employee.Address="Delhi";
		employee.Salary = 1000000.00;
		System.out.println("Name : "+employee.name);
		System.out.println("Age : "+employee.Age);
		System.out.println("Phone number : "+employee.Phone_number);
		System.out.println("Address : "+employee.Address);
		employee.printSalary();
		
		
		
		Manager manager = new Manager();
		manager.name = "Saurabh";
		manager.Age = 32;
		manager.Phone_number="8834568798";
		manager.Address="Delhi";
		manager.Salary = 1600000.00;
		System.out.println("Name : "+manager.name);
		System.out.println("Age : "+manager.Age);
		System.out.println("Phone number : "+manager.Phone_number);
		System.out.println("Address : "+manager.Address);
		employee.printSalary();
	}

}
