package com.bmpl.arraydemo;

import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
	Integer values1[][] =  new Integer[2][2];
	Integer values2[][] =  new Integer[2][2];
	Integer values3[][] =  new Integer[2][2];
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values in Matrix 1");
		
		
		for(int row = 0; row <2; row++)
		{
			for(int column = 0; column<2;column++)
			{
				values1[row][column] = scanner.nextInt(); 
			}
		}
		
		System.out.println("Enter values in Matrix 2");
		
		
		for(int row = 0; row <2; row++)
		{
			for(int column = 0; column<2;column++)
			{
				values2[row][column] = scanner.nextInt(); 
			}
		}

		
		for(int row = 0; row <2; row++)
		{
			for(int column = 0; column<2;column++)
			{
				values3[row][column] = values1[row][column] + values2[row][column]; 
			}
		}
		
		
		System.out.println("sum of matrix are:");
		
		for(int row = 0; row <2; row++)
		{
			for(int column = 0; column<2;column++)
			{
				System.out.print(values3[row][column]+ " "); 
			}
			System.out.println();
		}
		
	}

}
