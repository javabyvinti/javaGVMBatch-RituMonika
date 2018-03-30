package com.bmpl.interfacedemo;

public class StaticDemo {

	int value;	// instance variable
	static int value1;	// static variable
	
	StaticDemo(){
		value1++;
		value++;
		System.out.println("value1  = " + value1);
		System.out.println("value  = " + value);
		
	}

	public static void main(String[] args) {
		
		StaticDemo obj = new StaticDemo();
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		StaticDemo obj3 = new StaticDemo();
		
		StaticDemo.value1 = 5;// ClassName.StaticData
		
		System.out.println("static data = " + value1);
	}

}
