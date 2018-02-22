package com.bmpl.javabasic;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int value = 1; value <= 10; value++){//5<=10
			
			if(value == 5){ // 5 == 5
				continue; // skip the current iteration
				//break; // terminate the current iteration
			}else{
				System.out.println(value); // 1 2 3 4 
			}
			
		}
		System.out.println("Exited from For Loop");

	}

}
