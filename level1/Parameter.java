import java.util.Scanner;
class Parameter{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length of square");
		
		//taking length as input
		int length = input.nextInt();
		
		// perimeter of Square 
		int perimeter = 4*length;
		
		System.out.println("The length of the side is "+length+" whose perimeter is "+ perimeter);
	}
}