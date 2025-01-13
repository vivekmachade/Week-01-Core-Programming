import java.util.Scanner;
class Basiccal{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		// Taking number1 as input
		float number1 = input.nextFloat();
		
		System.out.println("Enter number 2");
		//Taking number2 as input
		float number2 = input.nextFloat();
		
		//arithmetic operators
	     float add = number1 + number2;
		 float sub = number1 - number2;
		 float multiply = number1*number2;
		 float division = number1/number2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+number1+" and "+number2+" is "+add+ " , " +sub+" , "+multiply+ " , and "+division); 
		
	}
}
		
		