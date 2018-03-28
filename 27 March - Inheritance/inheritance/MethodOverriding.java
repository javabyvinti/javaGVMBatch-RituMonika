package com.bmpl.inheritance;

import java.util.Collection;

class Account1{
	
	protected int balance; 
	// protected --> accessible outside the class through inhteritance
	
	void withdraw(){
		System.out.println("Withdraw amount of Account");
	
	}
}

class SavingAccount extends Account1{
	
	// Annotations --> @Override
	
//	@Override
//	void withdraw(){ // method overloading
//		
//	}
	
	
	
	void services(){
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		super.withdraw();
		System.out.println("Withdraw of SavingAccount");
	}
}

public class MethodOverriding {

	// Signature : method name, method return -type and method paramaters
	// all remain same
	// mandatory --> inheritance
	
//	int value;
//	
//	void print(int value){
//		
//	}
	
	Collection c;
	
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.withdraw();

	}

}
