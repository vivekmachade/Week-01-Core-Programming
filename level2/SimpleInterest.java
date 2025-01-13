import java.util.Scanner;

class SimpleInterest{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking principal,rate and time as input from user
		System.out.println("Enter principal in your SI");
		int principal = input.nextInt();
		
		System.out.println("Enter rate of your SI");
		int rate = input.nextInt();
		
		System.out.println("Enter time of your SI ");
		int time = input.nextInt();
		
		// find simple interest : Principal * Rate * Time / 100
		double SI = principal * rate * time / 100;
		
	    System.out.println("The Simple Interest is "+SI+" for Principal "+principal+" Rate of interset "+rate+" and time "+time);
	}
}