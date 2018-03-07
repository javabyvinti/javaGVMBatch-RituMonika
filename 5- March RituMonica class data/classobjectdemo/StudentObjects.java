package com.bmpl.classobjectdemo;

public class StudentObjects {

	public static void main(String[] args) {
		
		// Scanner --> java.util.Scanner
		// com.bmpl.classobjectdemo --> Student and StudentObjects

		//Scanner scanner = new Scanner();
		Student ram = new Student();//
		Student mohan = new Student();//
		ram.name = "Ram";
		ram.rollno = 1;
		ram.percentage = 54.7f;
		//ram.input();
		ram.print();
		//mohan.input();
		mohan.name = "Mohan";
		mohan.rollno = 2;
		mohan.percentage = 34.7f;
		mohan.print();
	}

}
