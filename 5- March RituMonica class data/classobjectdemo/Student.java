package com.bmpl.classobjectdemo;
// 
public class Student extends Object{

	//states
	String name;
	int rollno;
	float percentage;
	long phn;
	char grade; // default value is not assigned
	
	// float variable --> value --> by default--> double
	void input(){
		name = "Ram";
		rollno = 1;
					//literal
		percentage = 43.76f;	// 4 bytes --> 32 bits --> 31 bits
		phn = 9821436586l;// hardcoded value
		grade = 'D';
	}
	
	void print(){
		System.out.println("Name is = " +name);
		System.out.println("Rollno is = " + rollno);
		System.out.println("Percentage is= "+ percentage);
		System.out.println("Phone No is = "+phn);
		System.out.println("Grade is = "+grade);
	}
	
}
