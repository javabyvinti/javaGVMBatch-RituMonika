class Swap1{
	// use third variable or without third variable

	public static void main(String args[]){
		
		int value1 = 30;
		int value2 = 50;	

		value1 = value1 + value2;	
		// 30 + 50 =value1 =  80 

		value2 = value1 - value2;
		// 80 - 50 = value2 =  30
				
		value1 = value1 - value2;
		// 80 - 30 =value1 =  50		
		
		System.out.println("Value1 is = " + value1);
		System.out.println("Value2 is = " + value2);

	}

}
