import java.util.Scanner;
class WindChillTemperature{
	
	public static double calculateWindChill(double temp, double windSpeed){
		
		// wind chill temperature using the formula 
		double windChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
		
		return windChill;
		
	}
	
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// taking temperature and windspeed as input from the user
		
		System.out.print("Enter the temperature : ");
		double temp = input.nextDouble();
		
		System.out.print("Enter the wind speed : ");
		double windSpeed = input.nextDouble();
		
		//methode calling
		double windChillTemperature = calculateWindChill(temp,windSpeed);
		
		System.out.println("Wind chill temperature is "+windChillTemperature+" with temperature is "+temp+" with wind speed is " +windSpeed);
	}
}
