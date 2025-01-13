import java.util.Scanner;
class MultipleBelow{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Number : ");
	  
	  // Taking variable Number as input for user
	  int number = input.nextInt();
	  
	  //loop 100 to 1
	  for(int currentnumber=100;currentnumber>0;currentnumber--){
		  
		  //100 to 1 which is divide by number
		  if(currentnumber%number==0)System.out.println(currentnumber);
		  continue;
	  }
	}
}