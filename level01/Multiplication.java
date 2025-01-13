import java.util.Scanner;
class Multiplication{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	 
	  System.out.print("Enter number for multiplication : ");
	  
	  // Taking number as input for user
	  int number = input.nextInt();
	  
	  // calculate number from 6 to 9 
	  for(int currentNumber=6;currentNumber<10;currentNumber++){
		  System.out.println( number +" * "+ currentNumber +" = "+currentNumber*number);
	  }
	}
}
