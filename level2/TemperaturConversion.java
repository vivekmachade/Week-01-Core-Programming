import java.util.Scanner;

class TemperaturConversion{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking temperature(celsius) as input from user
		System.out.println("Enter temperature in Celsius ");
		double celsius = input.nextInt();
		
		// convert celsius to fahrenheit : (°C × 9/5) + 32 
		
		double farenheitResult = ( celsius * 9/5) +32;
		
		
		System.out.println("The "+ celsius + " celsius is "+ farenheitResult+" fahrenheit");
	}
}