package com.bmpl.arraydemo;

import java.util.Scanner;

public class Matrix {

	Integer val[][];
	
	void temp(){
		val = new Integer[2][2];
	}
	
	// transpose of matrix
	public static void main(String[] args) {
			// 2D arrays --> row and table
		
		Matrix m = new Matrix();
		
		m.val = new Integer[2][2];
		
								// 0 and 1 
		Integer values[][] =  new Integer[2][2];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values in array");
		
		
		for(int row = 0; row <2; row++)
		{
			for(int column = 0; column<2;column++)
			{
				values[row][column] = scanner.nextInt(); 
			}
		}

		System.out.println("Array elements are:");
		
		for(int row = 0; row <2; row++)
		{
			for(int column = 0; column<2;column++)
			{
				System.out.print(values[column][row]+ " "); 
			}
			System.out.println();
		}
		
	}

}
