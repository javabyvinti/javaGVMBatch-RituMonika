package com.bmpl.exceptions;

public class Problem2 {
	
	Problem1 problem1 ; // null	// 7777
	
	public static void main(String[] args) {
		
		
		
		Problem2 obj = new Problem2(); // 8888
						// 8888.null.
		System.out.println(obj.problem1.number);
		
		
		try{
			int i[] = new int[5];
			i[40]=  900;
		}catch(Exception e){
			System.out.println("Exception is = " + e);
			System.exit(0);
			//return;
		}
		finally{
			System.out.println("Inside finally block");
		}

	}

}
