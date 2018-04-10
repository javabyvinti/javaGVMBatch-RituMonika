package com.bmpl.arraydemo;

import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		
		Integer values[] = new Integer[5];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements:");
		
		for(int i = 0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		
		int max = values[0];
		
		for(int i = 0; i<values.length; i++){
				
			for(int j = i+1; j<values.length; j++){
				if(values[i] == values[j]){
					System.out.println("Duplicate element " + values[i]);
					break;
				}		
			}
		}

	}
}
