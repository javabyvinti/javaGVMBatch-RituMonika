package com.bmpl.javabasic;

/*
	
	54321
	5432
	543
	54
	5
	

 */

public class Pattern4 {

	public static void main(String[] args) {
		for(int row = 1; row<=5; row++){//2<=5
			for(int column = 5; column>=row; column--){// 5>=2
				System.out.print(column); // 54321
										 //  5432
			}
			System.out.println();
		}

	}

}
