import java.util.Scanner;
class CheckNumber{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Check the number is Positive or negative or zero \n Enter the number ");
		
		//Taking number as input for user		
		int number = input.nextInt();
		
		// Checking number is Positive or negative or zero
		if(number>0){
			System.out.println("Number is Positive ");
		}
		else if(number<0){
			System.out.println("Number is Negative ");
		}
		else {
			System.out.println("Number is Zero ");
		}
	}
}