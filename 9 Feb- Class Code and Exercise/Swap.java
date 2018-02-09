class Swap{
	// use third variable or without third variable

	public static void main(String args[]){
		
		int value1 = 90;
		int value2 = 100;	
		int temp;

		temp = value1;	//value1 = 90, temp = 90
		value1 = value2;//value2 = 100 value1 = 100	
		value2 = temp;	// value2 = 90
		
		System.out.println("Value1 is = " + value1);
		System.out.println("Value2 is = " + value2);

	}

}
