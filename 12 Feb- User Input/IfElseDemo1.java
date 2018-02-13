package com.bmpl.javabasic;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int first, second;
		
		System.out.println("Enter your first value");
		
		first = scanner.nextInt();
		
		System.out.println("Enter your second value");
		
		second = scanner.nextInt();
		
		System.out.println("Enter your third value");
		
		int third = scanner.nextInt();
		// 1220 154 65
		
		if(first>second && first>third){// 1220> 
			System.out.println("First value is greater");
			
		}else if(second>third){// 154>65
			System.out.println("Second value is greater");
		}else{
			System.out.println("Third value is greater");
		}
		
	}

}
