package com.bmpl.inheritance;

class Account{
	
	Account(){
		System.out.println("Default cons of account class");
	}
	
	Account(int balance){
		System.out.println("param cons of Account class"+balance);
	}
	
}

class CurrentAccount extends Account{
	
	// default --> accessible only inside the package
	
	CurrentAccount(){
		//
		//
		super(4000); // constructor automatically 
		System.out.println("Default cons of Current Account"); 
		
	}
}

public class ConstructorCalling {

	
	public static void main(String[] args) {
		CurrentAccount obj = new CurrentAccount();

	}

}
