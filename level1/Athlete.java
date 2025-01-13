import java.util.*;

class Athlete{
	
	public static double Rounds(double base,double rightSide,double leftSide){
		
		//athlete want complete 5 km running 
		int totalDistance =5;
		
		// calculate the perimeter of traingle
		double perimeter = base+rightSide+leftSide;
		
		// Round up the number of round
		double rounds = totalDistance/perimeter;
		return rounds;
	}
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);

		// Taking base,right side and left side as input from user
		System.out.println("Enter the base in km ");
		double base = input.nextDouble();
		
		System.out.println("Enter the right side in km ");
		 double rightSide = input.nextDouble();
		
		System.out.println("Enter the Left side km ");
		double leftSide = input.nextDouble();
		
		
		// calling methode
		double result =Rounds( base, rightSide, leftSide);
		
		 System.out.println("The total number of rounds the athlete will run is " + (int)result + " to complete 5 km.");
		
		
			}
}