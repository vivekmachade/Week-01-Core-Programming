import java.util.Scanner;
class Natural{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("To check number is Natural or not \nEnter the number : ");	  
	  //Taking Nnumber as input from user 
	  int nNatural = input.nextInt();
	  
	  // checking number is natural number
	  if(nNatural >0){
		 
		 //sum the n natural number
		 int sumNatural = nNatural*(nNatural+1)/2;
			 
		 System.out.println("The sum of " +sumNatural+" natural number is "+nNatural);
	  }
	  else{
		  System.out.println("The number " +nNatural+" is not natural number");
	  }
	}
}