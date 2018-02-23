package com.bmpl.javabasic;

/*
	     *	 row = 1,5 , column = 1,3,5,7,9
	    ***
	   *****
	  *******
	 *********

 */

public class Pattern5 {

	public static void main(String[] args) {
		for(int row = 1; row<=5; row++){ // row =3<=5
			
			for(int space = 4; space >=row; space--){//4>=1
				System.out.print(" ");//     *
			}
										// 5
			for(int column = 1; column <=(2*row-1); column++){//1<=5
				System.out.print("*");//    *
			}						 //     ***
			System.out.println();
		}

	}

}
