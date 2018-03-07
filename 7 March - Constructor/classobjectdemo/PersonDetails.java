package com.bmpl.classobjectdemo;

import java.util.Scanner;

public class PersonDetails {

	PersonDetails(){}
	
	//return type 
	int PersonDetails(){
		// return keyword attach value
		//which must be returned when this function is called
		
		return 0;
		 
	}
	
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		//String userName = ; 
		
		person.setPersonName(scanner.nextLine());
		
		
		String name = person.getPersonName();
		System.out.println(name);
		
		
		System.out.println("Enter your id");
		
		person.setPersonId(scanner.nextInt());
		
		System.out.println(person.getPersonId());
	
		//System.out.println(person.getPersonId());
		
		//System.out.println(person.getPersonName());
		

	}

}
