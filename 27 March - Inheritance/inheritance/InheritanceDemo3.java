package com.bmpl.inheritance;

class GrandParent extends Object{
		
}
class Parent extends GrandParent{
	
	Parent(){
		super();
		System.out.println("Default of Parent");
	}
	
	void display(){
		System.out.println("Display data from database");
	}
}

class Child extends Parent{
	
	int value1 = 10, value2 = 20;
	
	// method overriding
	// method name, return type and parameters all must be same
	@Override// override 
	void display(){
		super.display();
		System.out.println("Display data from Child");
	}
	
	// method name must be same and parameters must be changed 
	//-->changing return type is optional 
	
	void sum(int value1, int value2){
		System.out.println(value1 + value2);
	}
	
	void sum(){
		System.out.println(value1 + value2);
	}
	
	long sum(long value1, long value2){
		return value1 + value2;
	}
	
	Child(int v){
		System.out.println("Default of Child");
	}
}


public class InheritanceDemo3 {
	public static void main(String[] args) {
		Child ram = new Child(5);// object of Child class
		ram.sum();
		ram.sum(34, 56);
		System.out.println(ram.sum(9865433257l, 9843327654l));
		ram.display();
	}
}