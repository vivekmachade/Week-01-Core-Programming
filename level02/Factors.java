import java.util.Scanner;
class Factors{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Number : ");
	  
	  // Taking variable Number as input for user
	  int number = input.nextInt();
	  
	  //loop 1 to give number
	  for(int currentnumber=1;currentnumber<number;currentnumber++){
		  
		  //number divide by currentnumber to get factors
		  if(number%currentnumber==0)System.out.println(currentnumber);
		  continue;
	  }
	}
}