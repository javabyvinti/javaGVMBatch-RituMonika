class Datatype{

	public static void main(String args[]){
		int a = 10;
		int b = 10;

		Integer c = new Integer(10);
		Integer d = new Integer(10);
		// equals
		System.out.println(c.equals(d));	// true

		String java = new String("Java");
		String java2 = new String("java");
		// Float, Double, Long	--> equals --> available for 		//all reference class	

		System.out.println(java.equalsIgnoreCase(java2));

	// == --> comparision operator --> true or false
	//--> comparing the value --> primitive type
	//--> comparing the address--> reference type


	
	}

}