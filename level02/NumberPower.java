import java.util.Scanner;
class NumberPower{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Number : ");
	  
	  // Taking variable Number as input for user
	  int number = input.nextInt();
	  
	  System.out.print("Enter the power : ");
	  
	  // Taking variable power as input for user
	  int power = input.nextInt();
	  
	  int result = 1;
	  
	  //loop 1 to give power
	  for(int currentnumber=1;currentnumber<=power;currentnumber++){
		  
		  //calculate the power of number
		  result=result*number;
	  }
	  
	  System.out.println(result);
	}
}