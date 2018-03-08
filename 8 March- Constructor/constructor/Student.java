package com.bmpl.constructor;

// this --> current class --> instance var, constrcutor, methods 


public class Student {

	// 2 types of constructor
	// common values share among all objects --> collegename
	// default constructor
	
	// change according to the object --> param constructor
	String collegeName;
	String studentName;
	int rollno;
	float percentage;
	
	// constructor chaining
	// initialization constructor
	Student(){
		collegeName = "BMPL";
	}
	
	// constructor overloading
	Student(String studentName, int rn){
		this(66.43f);	// constructor calling must be first statement
		this.studentName = studentName;
		this.rollno = rn;
	}
	
	Student(float percentage){
		this();
		this.percentage = percentage;
	}
	
	void print(){
		System.out.println("Name is = " +studentName);
		System.out.println("College is = " +collegeName);
		System.out.println("Rollno is = "+rollno);
		System.out.println("Percentage is = "+percentage);
	}
	
	public static void main(String[] args) {
		
		Student ram = new Student("Ram", 5);
		ram.print();
	}

}
