import java.util.Scanner;
class NaturalSumFor{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("To check number is Natural or not and sum of Natural Number \nEnter the number : ");

	  
	  //Taking Nnumber as input from user 
	  int nNatural = input.nextInt();
	  
	  // taking sum variable for store the sum number give by user
		int sum = 0;
	  
	  // checking number is natural number
	  if(nNatural >0){
		 
		 //sum the n natural number formula
		 int sumNatural = nNatural*(nNatural+1)/2;
			 
		System.out.println("The sum of " +sumNatural+" by using formula natural number is "+nNatural);
		 
		 //sum of n natural number using loop		 
		 for(int tem = nNatural;tem>0;tem--){
			sum = sum + tem;
			
		 }
		 
		System.out.println("The sum of " +sum+" by using loop natural number is "+nNatural);
			
	  }
	  else{
		  System.out.println("The number " +nNatural+" is not natural number");
	  }
	}
}