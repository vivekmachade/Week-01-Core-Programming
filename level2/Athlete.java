import java.util.Scanner;

class Athlete{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		int totalDistance =5;
		
		// Taking base,right side and left side as input from user
		System.out.println("Enter the base in km ");
		double base = input.nextDouble();
		
		System.out.println("Enter the right side in km ");
		 double rightSide = input.nextDouble();
		
		System.out.println("Enter the Left side km ");
		double leftSide = input.nextDouble();
		
		// calculate the perimeter of traingle
		double perimater = base+rightSide+leftSide;
		
		// Round up the number of rounds
		
		double rounds = totalDistance/perimeter;
		
		 System.out.println("The total number of rounds the athlete will run is " + (int)rounds + " to complete 5 km.");
		
		
			}
}