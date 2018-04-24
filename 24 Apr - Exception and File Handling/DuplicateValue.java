package com.bmpl.array;

import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your values");
		
		Integer values[] = new Integer[5];
		
		int arraySize = values.length;	// 5
		
		for(int i = 0; i< arraySize; i++)
		{
			values[i] = scanner.nextInt();
		}
		// 12 34 56 78 12
		
		
		// 23 45 67 23 78
		
		
		// 23 45 23 45 7
		
		System.out.println("Resulting array is =");
		for(int i = 0; i < arraySize; i++)// i = 0<=4
		{
			for(int j = i+1; j < arraySize; j++) // j=3<=4
			{
					// 23 == 23
				if(values[i].equals(values[j]))
				{
					// 4 < 4
					while(j < arraySize - 1){
						// values[3] = values[4]
						// 23 = 78
						values[j] = values[j + 1];
						j++;	// 4
					}
				arraySize--; // 4 	
				}
			}
		}
		
		for(int i = 0; i< arraySize; i++){
			System.out.println(values[i]);
		}	
	}
}