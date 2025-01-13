import java.util.Scanner;
class EvenOrOdd{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter Natural Number : ");
	  
	  // Taking number as input for user
	  int number = input.nextInt();
	  
	  // loop for print number 
	  for(int currentNumber=1;currentNumber<=number;currentNumber++){
		  
		//check the number is even  
	    if(currentNumber%2==0){
		 
		  System.out.println(currentNumber+" this even number ");
		}
		
		//if number is not even then odd
		else{
			System.out.println(currentNumber+" this odd number ");
		}
	  }
	}
}
			
	  