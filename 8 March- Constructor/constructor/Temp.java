package com.bmpl.constructor;
// by default public class must be one only

// public --> 
class Data{
	//access inside package level
	public Data(){
		System.out.println("Default of Data class");
	}
	
}

public class Temp {

	public Temp(int v){
		
	}
	
	public static void main(String[] args) {
		
		Data obj = new Data();
		Temp temp = new Temp(4);
	}

}
