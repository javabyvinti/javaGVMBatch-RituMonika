package com.bmpl.javabasic;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i<=3; i++) // 1<=3
		{
			for(int j = 1; j<=3; j++){ // j = 
				if(i==j){ // 3==3
					continue;
					//break;
				}else{
					System.out.println("i is = " +i + " j is = " + j);
				}
			}
		}
	}

}
