import java.util.Scanner;
class Vote{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print(" Enter your Age ");	  
	  //Taking Person as input from user 
	  int age = input.nextInt();
	  
	  // Checking person can vote or not
	  
	  if(age>=18){
		  System.out.println("The person's age is "+age+ " and can vote ");
	  }
	  else{
		   System.out.println("The person's age is "+age+ " and cannot vote ");
	  }
	}
}