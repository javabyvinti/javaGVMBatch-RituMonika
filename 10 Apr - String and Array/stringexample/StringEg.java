package com.bmpl.stringexample;

public class StringEg {

	public static void main(String[] args) {
		
		int N = 100000;
		long t ; 
		
		String sb1 = new String("hello");
		t = System.currentTimeMillis();	// 123456778
		System.out.println("time = " + t);
		
		for(int i = N; i>=0; i--){
			sb1.concat("hi");
		}
		// Scanner sc = new Scanner(System.in);
											// 1234643322 - 
		System.out.println("Current Time : " + System.currentTimeMillis());
		System.out.println("String time: " + (System.currentTimeMillis() - t));

		StringBuffer sb2 = new StringBuffer("hello");
		t = System.currentTimeMillis();	// 123456778
		System.out.println("time = " + t);
		
		for(int i = N; i>=0; i--){
			sb2.append("h1");
		}
		// Scanner sc = new Scanner(System.in);
											// 1234643322 -
		System.out.println("String Buffer output:");
		System.out.println("Current Time : " + System.currentTimeMillis());
		System.out.println("String time: " + (System.currentTimeMillis() - t));
	
		
		StringBuilder sb3 = new StringBuilder("hello");
		t = System.currentTimeMillis();	// 123456778
		System.out.println("time = " + t);
		
		for(int i = N; i>=0; i--){
			sb3.append("h1");
		}
		// Scanner sc = new Scanner(System.in);
											// 1234643322 -
		System.out.println("String Builder output:");
		System.out.println("Current Time : " + System.currentTimeMillis());
		System.out.println("String time: " + (System.currentTimeMillis() - t));
		
		
	}

}
