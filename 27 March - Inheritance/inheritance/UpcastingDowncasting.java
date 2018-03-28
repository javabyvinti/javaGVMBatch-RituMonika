package com.bmpl.inheritance;

class A1{
	
	int value = 10;
	
	A1(){
		System.out.println("A1 class Cons");
	}
	
	void show(){
		System.out.println("Show data of A1 class");
	}
	
	void data(){
		System.out.println("Data of A1");
	}
	
}

class B1 extends A1{
	
	int value = 20;
	
	
	B1(){
		System.out.println("B1 class Cons");
	}
	void input(){
		System.out.println("Input of B1");
	}
	
	@Override
	void show(){
		System.out.println("Show data of B1 class");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		
		A1 obj = new B1(); // Upcasting --> automatically
		
		float v = 54;
		int i = (int)v;
		
		B1 b1 = (B1)obj;	// Downcasting
		
		obj.data();
		obj.show();
		
		System.out.println(obj);
		System.out.println(b1);
	}

}
