import java.util.Scanner;
class Largest{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
      
	  // Taking number1 , number2 and number3 as input from user
	  
	  System.out.print("Enter the first number ");
	  int number1 = input.nextInt();
	  
	  System.out.print("Enter the second number ");
	  int number2 = input.nextInt();
	  
	  System.out.print("Enter the third number ");
	  int number3 = input.nextInt();
	  
	  // checking which is largest number
	  if(number1 > number2 && number1 < number3){
			  System.out.println("Is the first number the largest?  Yes ");
		}
	  else if(number1 < number2 && number2 > number3){
		  System.out.println("Is the second number the largest?  Yes ");
	    }
		else if(number3>number1 && number3 > number2){
			System.out.println("Is the third number the largest?  Yes ");
		}
	}
}
