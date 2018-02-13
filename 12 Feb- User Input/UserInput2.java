import java.util.Scanner;


class UserInput2{

	public static void main(String args[])
	{
		// Using Scanner
// Scanner --> Predefined class --> Create an Object of Scanner class

		Scanner scanner = new Scanner(System.in);
	
		int first, second;

		System.out.println("Enter your first value");
		
		first = scanner.nextInt();
	
		System.out.println("Enter your second value");
		
		second = scanner.nextInt();
		
		int sum = first + second;

		System.out.println("Result is = " + sum);

	}
}