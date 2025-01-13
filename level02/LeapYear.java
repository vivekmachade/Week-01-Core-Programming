import java.util.Scanner;
class LeapYear{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Year : ");
	  
	  // Taking variable year as input for user
	  int year = input.nextInt();
	  
	  // check year is leap year divisible 4
	  if(year%4==0){
		  
		  // leap Year not divisible by 100
		  if(year%100==0){
			  
			  //if leap year divisible by 100 further we check leap year by divisible by 400
			  if(year%400==0){
				  System.out.println(year +" is leap year");
			  }
			  else{
				  System.out.println(year + " is not leap year");
			  }
		  }
		   else	{
				  System.out.println(year + " is not leap year");
			  }  
			 
		  
	  }
	   else{
				  System.out.println(year + " is not leap year");
			  }
	}
}
	  
			  