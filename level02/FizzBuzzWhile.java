import java.util.Scanner;
class FizzBuzzWhile{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Number : ");
	  
	  // Taking variable Number as input for user
	  int number = input.nextInt();
	  
	  // Checking the number is positive
	 if(number>=0){
		 int currentnumber=0;
		 while(currentnumber<=number){
			 
			 
			 // checking number is multiple of 3 and 5 with respect print Fizz and Buzz
			if(currentnumber%3==0)System.out.println("Fizz");
			if(currentnumber%5==0)System.out.println("Buzz");
			
			if(currentnumber%3!=0 && currentnumber%5!=0)System.out.println(currentnumber);
			
			currentnumber++;
			System.out.println();
		 }
	 }
	}
}
