package com.bmpl.exceptions;

class A{
	
	void data(){
		System.out.println("Data of A");
	}
	
}


class B extends A{
	
	void data(){
		data();
		System.out.println("data of B");
	}
	
}

public class StackOverflow {

	public static void main(String[] args) {

		B obj = new B();
		obj.data();
	}

}
