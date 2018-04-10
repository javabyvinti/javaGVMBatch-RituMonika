package com.bmpl.stringexample;

public class StringDemo1{

	public static void main(String[] args) {

			String name = "Ram";	
			// All String in Java are immutable
			// immutable --> once reference is created, it cannot be modified
			
			// name = Ram Kumar	// 2nd reference
			
			name = name.concat(" kumar"); // two strings concatenation

//			String completeName = fullname.concat(" Sharma");
//			
//			System.out.println(fullname);
						// 0-4
						// 2, <5
			String data1 = "First";
			String data2 = data1;
			String data3 = new String("New");
			String data4 = new String("New");
			String data5 = data4;
						
			System.out.println(data1 == data2);
			System.out.println(data1.equals(data2));
			
			System.out.println(data1.replace("s", "t"));
			
			//data1.substring(3, 6); // 3, <5
			// String array[]
			
			String value = "This is my data";
							
			String result[] = value.split("i");
			
			System.out.println("After Split");
			for(String r : result){
				System.out.print(r);
			}
			
	}
}
