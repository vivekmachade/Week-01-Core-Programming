import java.util.Scanner;

class DoubleOperation{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking a,b and c as input from user
		System.out.println("Enter the a ");
		double a = input.nextInt();
		
		System.out.println("Enter the b ");
		 double b = input.nextInt();
		
		System.out.println("Enter the c ");
		double c = input.nextInt();
		
		// integeer operations
		 
		double add = a+b*c;
		double multiply = a*b+c;
		double cadd = c+a/b;
		double div = a%b+c;
		
		System.out.println("The results of Int Operations are "+add+" , "+multiply+" , "+cadd+" , "+div);
	}
}