package com.bmpl.javabasic;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// WAP to input a value from user and print table
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int userChoice = scanner.nextInt(); // 4
		
		int value = 1;
		
		while(value<=10){// 4 X 2 = 8								//4 * 1 = 4
			System.out.println(userChoice + " X " + value + " = " + userChoice * value);
			value++;
		}
		
	}

}
