package com.bmpl.inheritance;

// polymorphism --> one way --> many forms --> +
// 2 types : 1--> method overloading // compile time polymorphism or static binding
			//2--> method overriding // runtime polymorhism or dynamic binding

// method overloading
// constructor overloading
// sign --> method name must remain same, return type or paramters can be different

public class InheritanceDemo2 {

	int first  =90, second  =10;
	
	void sum(){
		System.out.println(first + second);
	}
	
	void sum(int first, int second){
		System.out.println(first + second);
	}
	
	void sum(float first, int second){
		System.out.println(first+second);
	}
	
	int sum(int first, int second, int third){
		return first + second + third;
	}
	
	public static void main(String[] args) {
		// + overload --> operator overloading
//		System.out.println("Hello" + "Java");
//		System.out.println(12 + 43);

		InheritanceDemo2 obj = new InheritanceDemo2();
		obj.sum(obj.first, obj.second);
		obj.sum(43.43f, 65);
		//int result = obj.sum(21, 32, 32);
		System.out.println(obj.sum(21, 43,  65));
	}

	private void sum(double d, int second2) {
		// TODO Auto-generated method stub
		
	}

}
