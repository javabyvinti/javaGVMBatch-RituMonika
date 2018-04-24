package com.bmpl.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	// throw and throws
	
	int value1;
	int value2;
	
	
	void input() throws InputMismatchException
	{
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Enter first value");
		value1 = scanner.nextInt();
		
		System.out.println("Enter second value");
		value2 = scanner.nextInt();
	}
	
	
	int calculation() throws ArithmeticException{
		input();
		
		int result = value1/ value2;
		return result;
	}
	
	void print() throws Exception{
		System.out.println("Result is = " + calculation());
//		try{
//		System.out.println("Result is = " + calculation());
//		}
//		catch(ArithmeticException e){
//			System.out.println("Divible by 0 is not possible");
//		}
//		catch(InputMismatchException e){
//			System.out.println("Only numbers are allowed");
//		}
//		catch(Exception e){
//			System.out.println("Some other exception");
//		}
	}
	
	
	public static void main(String[] args)  {
		
		//Scanner sc  = new Scanner(System.in);
		
		//int value = new Scanner(System.in).nextInt();
		
		ExceptionHandling obj  = new ExceptionHandling();
		//obj.input();
		try {
			obj.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
