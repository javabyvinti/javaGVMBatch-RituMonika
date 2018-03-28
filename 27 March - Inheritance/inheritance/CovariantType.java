package com.bmpl.inheritance;

class Data1{
	int x, y;
	
}

class Data3 extends Data1{
	int z;
}


class DataNew{
	
	Data1 show(){
		
		Data1 obj = new Data1();
		obj.x = 100;
		obj.y = 200;
		return obj;
	}
	
}

class DataNew1 extends DataNew{

	@Override
	Data3 show(){
		Data3 obj = new Data3();
		obj.x = 500;
		obj.y = 600;
		obj.z = 700;
		return obj;
	}
	
}

public class CovariantType {

	public static void main(String[] args) {
		
		DataNew obj = new DataNew();
		Data1 d = obj.show();
		System.out.println(d.x);
		System.out.println(d.y);
		
		DataNew1 dataNew1  = new DataNew1();
		Data3 d3 = dataNew1.show();
		System.out.println(d3.x);
		System.out.println(d3.y);
		System.out.println(d3.z);
		
	}

}
