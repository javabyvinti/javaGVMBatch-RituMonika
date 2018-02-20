package com.bmpl.javabasic;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		String name;
		int age;
		String city;
		String gender;

		//ctrl+shift+o
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = scanner.next();
		
		System.out.println("Enter your age");
		age = scanner.nextInt();
		
		System.out.println("Enter your city[metro/non-metro]");
		city = scanner.next().toLowerCase();
		
		System.out.println("Enter your gender[male/female]");
		gender = scanner.next().toLowerCase();
	
		
		if((age>=25 && age<35) && gender.equals("male") && city.equals("metro")){
			System.out.println("Premium is 6%");
		}
		
		// ==
		
	}
	

}
