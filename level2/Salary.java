import java.util.Scanner;

class Salary{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking Salary and bonus as input from user
		System.out.println("Enter the salary ");
		int salary = input.nextInt();
		
		System.out.println("Enter the bonus ");
		int bonus = input.nextInt();
		 
		// Adding salary and bonus
		int total = salary+bonus;
		
	
		
		
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" . Hence Total Income is INR " + total);
	}
}