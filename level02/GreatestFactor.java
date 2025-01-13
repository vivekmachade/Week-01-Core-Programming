 import java.util.Scanner;
class GreatestFactor {
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Number : ");
	  
	  // Taking variable Number as input for user
	  int number = input.nextInt();
	 
	  
	  int greatestFactor = 1;
	  
	  //loop number-1 to 1
	  for(int currentnumber=number-1;currentnumber>=1;currentnumber--){
		  
		 //calculate the factor of number
		 if(number%currentnumber==0){
		 greatestFactor=currentnumber;
		 break;
	  }
	  }
	  
	  System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
	}
}