package com.bmpl.javabasic;

/*

	A
	AB
	ABC
	ABCD
	ABCDE

 */


public class Pattern3 {

	// A --> 65 --> 69
	public static void main(String[] args) {
		
		
//		System.out.println('A' + 1);
		
		for(char row = 'A'; row<='E'; row++){ // row = 'A'<='E'
			for(char column = 'A'; column<=row; column++){ // 'A'<='A'
				System.out.print(column); // 
			}
			System.out.println();
			
		}

	}

}
