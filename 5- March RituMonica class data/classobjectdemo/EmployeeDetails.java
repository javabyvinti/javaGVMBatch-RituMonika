package com.bmpl.classobjectdemo;

import java.util.Scanner;

public class EmployeeDetails {

	// states and data members
	// instance variables
	//--> which are declared inside the class but outside the method or constructor or blocks 
	// global variables
	String empName;
	int empId;
	long empPhn;
	
	// no return type - with arguments
	
				// name=Neha       id=10001    phn=9821433
	void input(String name, int id, long phn){

		empName = name;
		empId = id;
		empPhn = phn;
	}
	
	void print(){
		System.out.println("Name is = "+empName);
		System.out.println("ID is = "+ empId);
		System.out.println("Phone is = " + empPhn);
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		EmployeeDetails ram = new EmployeeDetails();
		System.out.println("Enter name, id, phn");
		ram.input(scanner.next(), scanner.nextInt(), scanner.nextLong());
		ram.print();
		
		EmployeeDetails mohan = new EmployeeDetails();
		mohan.input("Mohan", 10002, 923436543l);
		mohan.print();
	}

}
