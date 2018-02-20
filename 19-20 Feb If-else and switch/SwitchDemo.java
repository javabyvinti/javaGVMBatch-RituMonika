package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your character");
		
		// vowel or consonant --> t
		//y
		// hello   char array[25] --> 
										// "U" -> "u" --> 0 --> 'u'
		char userChoice = scanner.next().toLowerCase().charAt(0); // a or t or w
		
		
		String value = scanner.next().toLowerCase();
		
		// String 
		switch(value){	//u
		
		case "Mon": 
			System.out.println("Discount 3%");
			break;
		case "tue": 
			System.out.println("Discount 5%");
			break;
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println("Vowel");
//			break;
//
//		default:
//			System.out.println("Consonant");
//			break; // optional	
//		
		}// switch terminate

	}

}
