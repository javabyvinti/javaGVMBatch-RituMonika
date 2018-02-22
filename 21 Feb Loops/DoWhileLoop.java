package com.bmpl.javabasic;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int value = 11;	// 1..10

		do{// exit controlled loop
			System.out.println(value); //1 2 .. 10
			value++; // 10 + 1 = 11
		}while(value<=10);//11<=10
	}

}
