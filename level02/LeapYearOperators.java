import java.util.Scanner;
class LeapYearOperators{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Year : ");
	  
	  // Taking variable year as input for user
	  int year = input.nextInt();
	  
	  // check year is leap 
	  if((year%4==0)&&(year%100!=0)||(year%400==0))System.out.println(year +" is leap year");
	  else System.out.println(year + " is not leap year");
	  
	}
}
	  
			  