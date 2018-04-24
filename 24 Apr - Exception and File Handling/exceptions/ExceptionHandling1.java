package com.bmpl.exceptions;
import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		//int v = Integer.parseInt(args[0]); // one
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first value");
		int value1 = scanner.nextInt();
				
		System.out.println("Enter your second value");
		int value2 = scanner.nextInt();		
		
		int sum = value1 / value2;
		
		
		
		int value = Integer.parseInt("ten");
		
		System.out.println("A" + 1);
		System.out.println('A' + 1);
		
		// "" --> 90
		
		
		System.out.println("result is = " + sum);

	}

}
