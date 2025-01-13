import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Factorial number : ");
	  
	   //Taking number as input from user 
	   int number = input.nextInt();
	   
	    // taking sum variable for store the sum number give by user
		int sum = 1;
	   
	   // calculate factorial of number
	   int tem = number;
	   while(tem>1){
		   sum = sum*tem;
		   tem--;
	   }
	   System.out.println("Factorial of "+number+" Which is "+sum);
	}
}