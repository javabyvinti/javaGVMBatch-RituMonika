package com.bmpl.exceptions;

import java.util.Scanner;

class CustomException extends Exception{
	
	int age ;
	
	CustomException(int age){
		this.age = age;
	}
	
	// Object --> toString(), Throwable--> toString(), Exception,  CustomException--> toString()
	
	@Override
	public String toString(){
		//super.toString();
		return "Cannot vote";	
	}
	
}



public class Throw {

	public static void main(String[] args) throws Exception {
		
		Throw obj1 = new Throw();// toString()
		
		System.out.println(obj1);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age");

		int age = scanner.nextInt();
		
		if(age>18){
			System.out.println("You can vote");
		}else{
			//System.out.println("You cannot vote");
			
			//CustomException obj = new CustomException(age);
			throw new CustomException(age); // explictly call
		}
		
		
	}

}
