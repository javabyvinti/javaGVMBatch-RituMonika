package com.bmpl.javabasic;

public class Pattern1 {

	/*
	 	*	row = 1,5 and column = 1,5
	 	**
	 	***
	 	****
	 	***** 
	 */
	
	
	public static void main(String[] args) {
		
		for(int row = 1; row<=5; row++) // row = 2<=5
		{		  
			for(int column = 1; column<=row; column++) // column = 1<=2
			{
				System.out.print("*");//*****
									//  *****
			}							
			System.out.println(); 
		}
	}

}
