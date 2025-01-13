import java.util.Scanner;
class SpringSeason{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// taking month and day as input from the user
		
		System.out.print("Check the Spring season in number \n Enter the month : ");
		int month = input.nextInt();
		
		System.out.print("Enter the day : ");
		int day = input.nextInt();
		
		//check the month is spring season
		if(month <= 2 || month>=7)System.out.println("it not a Spring Season");
		
		//check the day is spring season
		else if(month==3 && day<=19)System.out.println("it not a Spring Season");
		
		else if(month==6 && day>=21)System.out.println("it not a Spring Season");
		
		else System.out.println("it is a Spring Season");
	}
}
