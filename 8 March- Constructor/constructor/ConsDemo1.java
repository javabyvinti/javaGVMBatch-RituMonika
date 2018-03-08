package com.bmpl.constructor;

public class ConsDemo1 {

	int value;
	
	
	
	// initialization -->
	
	ConsDemo1(){
			System.out.println("Constructor is called");
	}
	
	
	ConsDemo1(int v){
		System.out.println("Parameterized constructor " +v); 
		
	}
	
	ConsDemo1(int a, int b){
		System.out.println("Parameterized with " + a + b);
	}
	
	public static void main(String[] args) {
		
		ConsDemo1 obj = new ConsDemo1(12);

		ConsDemo1 obj2 = new ConsDemo1();

		ConsDemo1 obj3 = new ConsDemo1();
	}
	

}
