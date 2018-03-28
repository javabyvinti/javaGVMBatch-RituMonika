package com.bmpl.inheritance;

import java.util.Scanner;

public class OnlineShopping {

	
	String search(String brandName){
		return brandName;
	}
	
	int search(int minPrice, int maxPrice){
		return 0;
	}
	
	public static void main(String[] args) {
		
		OnlineShopping obj = new OnlineShopping();
		//obj.search("Samsung");
		System.out.println(obj.search("Samsung"));
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println(scanner.nextInt());
		

	}

}
