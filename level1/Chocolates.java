import java.util.Scanner;

class Chocolates{
	
	public static int[] distributeChocolates(int noChildren, int noChocolates){
		
		// Number of chocolates each children
		int distribute = noChocolates/noChildren;
		
		//Remaining chocolates
		int Remaining = noChocolates%noChildren;
		
		return new int [] {distribute,Remaining};
		
	}

	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking number of chocolates and number of children as input from user
		System.out.println("Enter the number of chocolates ");
		int noChocolates = input.nextInt();
		
		System.out.println("Enter the number of children ");
		int noChildren = input.nextInt();
	    
		//Methods calling
	    int Distributed = distributeChocolates( noChildren,  noChocolates);	   
		
		System.out.println("The number of chocolates each child gets is "+ Distributed[0]+" and\n the number of remaining chocolates are "+Distributed[1]);
		
		
		
		}
}