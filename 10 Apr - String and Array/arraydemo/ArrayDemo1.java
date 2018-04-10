package com.bmpl.arraydemo;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		// primitive or reference
		//int marks[] = {54, 87, 32, 8, 21, 98, 43, 55};
		// class
		
		//int value = 90;
		
		
		
		//Integer val = 12;
		
		// length
		
		//System.out.println(marks[2]);
		
		// name = "ram"  float  
		
		Integer marks[] = new Integer[5];	// 
		
		Integer max = 0;
		int index = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your values in Array");
		
		
		for(int i = 0; i<marks.length; i++){
			marks[i] = scanner.nextInt();
		}
		
		max = marks[0];
		
		for(int i = 1; i<marks.length; i++){
			if(max>marks[i]){
				max = marks[i];
				index = i;
			}
		}
		
		System.out.println("Min value is " + max + " found at index [" + index + "]");
		
		// max value is 54 found at index 0
		
		/*System.out.println("Your entered elements are:");
		
		for(Integer i : marks)
		{
			System.out.println(i);
		}*/
		
	}

}
