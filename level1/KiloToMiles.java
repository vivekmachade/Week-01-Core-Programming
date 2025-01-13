import java.util.Scanner;
class KiloToMiles{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter kilometer");
		//Taking kilometer as input
		double km = input.nextDouble();
		 
		// 1 km = 0.6 miles
		double miles = km*0.6;
		
		System.out.println("The total miles is "+ miles + " miles for the given "+km+ " km");
	}
}
