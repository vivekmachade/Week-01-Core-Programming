import java.util.Scanner;
class Divisible{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
      

	   
	   System.out.println("Enter the number  ");
	   // Taking number as input from user 
	   int number = input.nextInt();
	   
	   // if number is divisible by 5 then remainder will 0
	   if(number%5 == 0){
		   System.out.println("Is the number " + number +" divisible by 5?  Yes ");
	   }
	   else{
		    System.out.println("Is the number " + number +" divisible by 5?  No ");
	   }
	}
}