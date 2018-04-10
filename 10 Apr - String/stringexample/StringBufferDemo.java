package com.bmpl.stringexample;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Hello");
		
		System.out.println(name);
		
		name.append("Again");
		
		System.out.println(name);
		
		System.out.println(name.delete(2, 5));
		// 4 --> String -> length() --> "hello" --> 2, <5
		//"HelloAgain"
		name.substring(2, 7);
		
		System.out.println(System.currentTimeMillis());
		
	}

}
