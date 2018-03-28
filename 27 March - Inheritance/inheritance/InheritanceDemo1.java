package com.bmpl.inheritance;

class Bank{
	
	int balance;
	int remainingInterest;
	
	void deposit(){
		System.out.println("Deposit amount in Database");
	}
	
	void withdraw(){
		System.out.println("Deposit amount from database");
	}
	
}

class HDFC extends Bank{
	

	void withdraw(){
		//this.withdraw(); // recursive calling
		System.out.println("Withdraw the amount");
	}
	
	
	void doorToDoorService(){
		this.withdraw();
		balance = 3000;
		remainingInterest = 4;
		System.out.println("Balance = " + balance);
		deposit();	// method calling
		System.out.println("Door to Door service by HDFC");
	}
	

}

class ICICI extends Bank{
	
	void onlineAccountCreate(){
		System.out.println("Online Account Creation");
	}
}


public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		//Bank bank = new Bank();
		HDFC hdfc = new HDFC();
		//hdfc.deposit();
		hdfc.withdraw();
		hdfc.doorToDoorService();

	}

}
