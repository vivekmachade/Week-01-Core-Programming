import java.util.Scanner;
class RocketWhile{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking number as input from user
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		while(number-->1){
			System.out.println(number);
		}
	}
}