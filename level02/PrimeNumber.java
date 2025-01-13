import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Number : ");
	  
	  // Taking variable Number as input for user
	  int number = input.nextInt();
	  
	  // creating a boolean variable to check number is prime
	  boolean isPrime = true;
	  
	  for(int currentnumber=2;currentnumber<number;currentnumber++){
		  if(number%2==0){
			  isPrime = false;
			  break;
		  }
	  }
	  if(isPrime)System.out.println(number +" is prime number ");
	  else System.out.println(number +" is not prime number ");
	}
}
	  