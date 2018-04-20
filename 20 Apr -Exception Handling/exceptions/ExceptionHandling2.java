package com.bmpl.exceptions;

import java.util.Scanner;

public class ExceptionHandling2 {

	int value;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ExceptionHandling2 obj = new ExceptionHandling2();
		
		try{
		
			obj.value = 10;
			obj.value = scanner.nextInt()/10;
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());// getMessage() --> Throwable
		}
		// block
		finally{
			scanner.close();
			System.out.println("Always executed");
		}
		
		System.out.println("Enter a value");
		int v = scanner.nextInt();
		System.out.println(v);
		
		System.out.println(obj.value);
		// Scanner obj --> reference open --> reference close

	}

}
