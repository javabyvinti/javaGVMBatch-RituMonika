package com.bmpl.javabasic;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// vowel consonant --> 
		//if-else --> user input --> cmd line arguments/ Scanner class
		//and switch

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a alphabet");
		
		//String --> multiple characters --> "" and char --> single character --> ''
		 // "y"
			// char name[25]
		char userChoice  = scanner.next().charAt(0);	// String data input without whitespace
		
		//Logical OR -> 2 or more 
		if(userChoice=='a' 
				|| userChoice == 'e'
				|| userChoice=='i' 
				||	userChoice =='o'
				||userChoice =='u' )
		{
			System.out.println("Vowel");
		}else{
			System.out.println("Consonant");
		}
	
	}

}





