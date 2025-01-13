import java.util.Scanner;
class BmiPerson{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the weight in kg : ");
	  
	  // Taking variable weight as input for user
	  double weight = input.nextDouble();
	  
	   System.out.print("Enter the height in cm : ");
	  
	  // Taking variable height as input for user
	  double height = input.nextDouble();
	  
	  height /=100;
	  double bmi = weight/(height*height);
	  
	   //person who 18.5-24.9 is Normal
	   if(bmi>=18.5 && bmi <=24.9)System.out.println("You are Normal ");
	  
	    //person who 25.0-39.9 is overweight
       else if(bmi>=25.0 && bmi <= 39.9)System.out.println("You are Overweight ");
	  
	    //person who 40 more is Obese
	  else if(bmi>=40.0)System.out.println("You are Obese ");
	  
	  else System.out.println("You are underweight");
	}
}
