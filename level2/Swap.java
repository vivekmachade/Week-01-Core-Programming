import java.util.Scanner;

class Swap{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking number1 and number2 as input from user
		System.out.println("Enter the number1 ");
		int number1 = input.nextInt();
		
		System.out.println("Enter the number2");
		int number2 = input.nextInt();
		 
		// taking temporarily variable number3
		
		int number3 ;
		
		 number3 = number1;
		 number1= number2;
		 number2=number3;
		
	
		System.out.println("The swapped numbers are "+ number1 +" and "+number2);
	}
}