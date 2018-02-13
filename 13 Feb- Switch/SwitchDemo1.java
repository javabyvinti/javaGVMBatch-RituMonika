package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		
		char userChoice  = scanner.next().toLowerCase().charAt(0);	// String data input without whitespace
		
		// switch
		switch(userChoice){
		
		case 'a':	// userChoice == 1>5 --> true or false
		case 'e': 
		case 'i':
		case 'o':
		case 'u':
				
			System.out.println("Vowel");
			break;
			
		default:
			System.out.println("Consonant");
			break;
			
		}
		
	}

}








