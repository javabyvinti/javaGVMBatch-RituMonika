package com.bmpl.constructor;

public class WithoutCons {

	String name;
	int rollno;
	
	WithoutCons(){
		name = "Ram";
		rollno = 1;
	}
	
	void input(){
		name = "Ram";
		rollno = 1;
	}
	
	public static void main(String[] args) {
		WithoutCons obj = new WithoutCons();
		//obj.input();
		System.out.println(obj.name + obj.rollno);
	}

}
