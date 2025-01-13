import java.util.Scanner;

class Celsius {
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking temperature(fahrenheit) as input from user
		System.out.println("Enter temperature in fahrenheit ");
		double fahrenheit = input.nextInt();
		
		// convert fahrenheit to celsius  :  (°F − 32) x 5/9
		
		double celsiusResult = (fahrenheit - 32)* 5/9;
		
		
		System.out.println("The "+ fahrenheit + " fahrenheit is "+ celsiusResult+" celsius");
	}
}