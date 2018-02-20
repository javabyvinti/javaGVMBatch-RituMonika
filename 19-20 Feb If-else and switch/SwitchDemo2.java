package com.bmpl.javabasic;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		int value = 2;
		String day = "T";
		
		switch(day){// "Mon"
			case "Mon":	//day=="Mon" -> true  
				System.out.println("10% discount");
				break;
			default:
				System.out.println("0% discount");
				break;
			case "Tues": System.out.println("3% discount");
			
		}

	}

}
