package com.bmpl.javabasic;

public class WhileLoop {

	public static void main(String[] args) {
		
		int value = 2; // 1...10 / 10...1 // 1 3 5 7 9
			// 2 4 6 8 10
		
		// user value and print table --> 4
		// 4 X 1 = 4
		// 4 X 2 = 8
		 // ...
		// 
		while(value<=10){// 3<=10	// entry controlled loop
			System.out.println(value); //1 3
			value +=2;
			// value +=1; --> shorthand operator
		}

	}

}
