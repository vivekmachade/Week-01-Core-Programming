import java.util.Scanner;

class Divisor{
	
	public static int[] findQuotientRemainder(int number, int divisor){
		
		  //using '%' for reminder
		int remainder = number%divisor;
		int quotient=number/divisor;
		return new int[] {remainder,quotient};
		
	}	
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking number1 and divisor as input from user
		System.out.println("Enter the number ");
		int number = input.nextInt();
		
		System.out.println("Enter the divisor ");
		int divisor = input.nextInt();
		
		//methode calling
		int Quotient[] = findQuotientRemainder(number,divisor);
		
		System.out.println(" The Quotient is "+Quotient[1]+" and Reminder is "+Quotient[0]+" of two number "+ number + " and " + divisor);
	}
}
		
	    