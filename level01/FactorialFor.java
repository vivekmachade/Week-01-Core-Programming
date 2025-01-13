import java.util.Scanner;
class FactorialFor{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Factorial number : ");
	  
	   //Taking number as input from user 
	   int number = input.nextInt();
	   
	    // taking sum variable for store the sum number give by user
		int sum = 1;
	   
	   // calculate factorial of number using for loop
	   for(int tem = number;tem>1;tem--){
		   sum = sum*tem;
		   
	   }
	   System.out.println("Factorial of "+number+" Which is "+sum);
	}
}