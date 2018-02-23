package com.bmpl.javabasic;

/*
	1
	12		row = 1,5, column = 1,5
	123
	1234
	12345

	1	row  =1
	22 row = 2
	333
	4444
	55555

 */

public class Pattern2 {

	public static void main(String[] args) {
		for(int row = 1; row<=5; row++) // row = 3<=5
		{
			for(int column = 1; column<=row; column++)// col = 1<=3
			{
				System.out.print(row);	//1
											//12
											//123
			}
			System.out.println();
		}

	}

}
