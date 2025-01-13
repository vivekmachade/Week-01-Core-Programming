import java.util.Scanner;

class Pounds{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking Weight as input from user
		System.out.println("Enter your weight in pounds");
		int weight = input.nextInt();
		
		//convert pounds into kilograms (1pounds = 2.2 kg)
		 double kg = weight*2.2;
		 
		 System.out.println("The weight of the person in pound is "+weight+" and in kg is "+kg);
	}
}
		 
		