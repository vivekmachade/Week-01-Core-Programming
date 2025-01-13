import java.util.Scanner;
class Smallest{
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
	  
	  // checking number1 is smallest number
	  
	 if(number1 < number2 && number1 < number3){
			  System.out.println("Is the first number the Smallest?  Yes ");
		}
	 else{
         System.out.println("Is the first number the Smallest?  No ");	 
	 }
	}
}
