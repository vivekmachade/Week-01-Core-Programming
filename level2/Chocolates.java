import java.util.Scanner;

class Chocolates{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking number of chocolates and number of children as input from user
		System.out.println("Enter the number of chocolates ");
		int noChocolates = input.nextInt();
		
		System.out.println("Enter the number of children ");
		int noChildren = input.nextInt();
		
		// Number of chocolates each children
		
		int distributed = noChocolates/noChildren;
		
		//Remaining chocolates
		
		int Remaining = noChocolates%noChildren;
		
		System.out.println("The number of chocolates each child gets is "+ distributed+" and the number of remaining chocolates are "+Remaining);
		
		
		
		}
}