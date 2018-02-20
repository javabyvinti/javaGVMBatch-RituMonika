package com.bmpl.javabasic;

public class IfElseDemo {

	public static void main(String[] args) {
		
		// two values input from user and check which one is greater
		
		// command line argument
		// Scanner class --> user interaction
		
		int first = Integer.parseInt(args[0]); //"10"
		int second = Integer.parseInt(args[1]);

		if(first>second)	// true or false --> 1 statement print
			System.out.println("First is greater");
		else
			System.out.println("Second is greater");
	}

}
