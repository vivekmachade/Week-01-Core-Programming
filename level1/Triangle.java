import java.util.Scanner;
class Triangle{
	public static void main(String[] args){
		
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your height of Triangle");
		
		//Taking height as input for user
		int height = input.nextInt();
		
		System.out.println("What is your base of Triangle");
		
		// taking base as input for user
		int base = input.nextInt();
		
	    // Area of triangle
		double area = 1*base*height/2;
		
		System.out.println("the height of Triangle "+height+" whose area is "+ area);
	}
}	