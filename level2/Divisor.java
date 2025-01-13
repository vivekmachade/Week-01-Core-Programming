import java.util.Scanner;

class Divisor{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking number1 and number 2 as input from user
		System.out.println("Enter the number 1 ");
		int number1 = input.nextInt();
		
		System.out.println("Enter the number 2 ");
		int number2 = input.nextInt();
		
		// using '/' for quotient
		int quotient=number1/number2;
		
		//using '%' for reminder
		int remainder = number1%number2;
		
		System.out.println(" The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+ number1 + " and " + number2);
	}
}
		
	    