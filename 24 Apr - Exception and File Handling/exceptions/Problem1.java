package com.bmpl.exceptions;

public class Problem1 {

	int number = 90;
	
	public static void main(String[] args) {
		
		String s = "-";
		
		try{
			doMath(args[0]);// command line arguments // 10
			s += "t";
		} finally{
			System.out.println(s += "f"); // -tf
		}

	}
	
	public static void doMath(String a){// a = 0
		int y =7 / Integer.parseInt(a); // 7/0 --> ArithmeticException
	}

}
