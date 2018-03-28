package com.bmpl.inheritance;

import java.util.Scanner;
// final use --> variable, method , class
// class cannot be inherited

final class Bank1 {

	String name = "Ram Kumar";
	
	Integer a =10;
	
	//Bank1 name = "Aman";
	
	final int MINIMUM_BAL = 1000;
	
	Bank1(){
		
	}
	
	// scope --> default --> inside package
	
	// cannot override final method
	
	final void deposit(){
		//minimumBal =  100;
		//Thread 
		System.out.println("Deposit amount");
	}
	
	void show(){
		
	}
}

class CBI /*extends Bank1*/{
	
	// overloading
	String show(String value){
		return null;
	}
	
	
	// parent --> deposit --> default
	// private --> inside class --> 
//	@Override
//	public void deposit(){
//		//minimumBal = 200;
//	}
}


public class OverridingDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	}

}
