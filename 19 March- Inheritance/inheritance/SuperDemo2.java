package com.bmpl.inheritance;

class A extends Object{

	int value = 10;
	
	A(){
		
	}
	A(int a){
		
	}
	
	void details(){
		System.out.println("Details in Class A");
	}
	
	void data(){
		System.out.println("Data of class A");
	}
}

class B extends A{
	
	int value = 20;
	
	B(int value){
		System.out.println("B class cons");
	}
	
	void details(){
		super.details();
		data(); 
// common method --> calling parent functionality --> we need super keyword with method name
		System.out.println("Details in Class B");
	}
	
	B(){
		//super();
	}
	
	void printValue(int value){
		value = value + this.value + super.value;
	}
}

class C extends B{
	
	int value = 30;
	
	void print(int value){
		value = value + this.value + super.value + ((A)this).value; 
	}
	
	// float value  = 21
	
}

public class SuperDemo2 {

	public static void main(String[] args) {
		B obj = new B();
	}

}
