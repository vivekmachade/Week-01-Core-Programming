import java.util.Scanner;

class SimpleInterest{
	
	public static double simpleIn(double principal,double time,double rate){
		
		// find simple interest : Principal * Rate * Time / 100
		double SI = principal * rate * time / 100;
		
		return SI;
	
    }
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking principal,rate and time as input from user
		System.out.println("Enter principal in your SI");
		double principal = input.nextDouble();
		
		System.out.println("Enter rate of your SI");
		double rate = input.nextDouble();
		
		System.out.println("Enter time of your SI ");
		double time = input.nextDouble();
         
		 // calling methode
		double result = simpleIn(principal,time,rate);	
		
		
	    System.out.println("The Simple Interest is "+result+" for Principal "+principal+" \nRate of interset "+rate+"\n and time "+time);
	}
}