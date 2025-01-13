import java.util.Scanner;

class LeapYear{
	
	public static boolean leapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}else{
			return false;
		}			
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year for checking leap year (>= 1582) :");
		int year = input.nextInt();
		
		if(year < 1582){
			System.out.println("Please Enter a valid year ");
			return;
		}
		System.out.print(leapYear(year));
	}
}