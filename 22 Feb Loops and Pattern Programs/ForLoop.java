package com.bmpl.javabasic;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		// print 1 to 10
		
		// initialization
		// condition
		// increment/decrement
	
			// initialization
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an ending range");
		
		int range = scanner.nextInt();
		
		//int i = 1;
		
		// Nested Loop --> Loop inside Loop
		//outer loop
		for(int i = 1 ;i<=5;i++) // i = 6<=5
		{
			// inner loop
			for(int j = 1; j<=5;j++)// j = 1<=5
			{										//i = 2 j = 1
				System.out.println("value of i = " + i + " Value of j =" + j);
			}
			
		}
	}

}
