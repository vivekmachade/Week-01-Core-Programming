import java.util.Scanner;

class IntOperation{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Taking a,b and c as input from user
		System.out.println("Enter the  a ");
		int a = input.nextInt();
		
		System.out.println("Enter the  b ");
		int b = input.nextInt();
		
		System.out.println("Enter the  c ");
		int c = input.nextInt();
		
		// integeer operations
		 
		int add = a+b*c;
		int multiply = a*b+c;
		int cadd = c+a/b;
		int div = a%b+c;
		
		System.out.println("The results of Int Operations are "+add+" , "+multiply+" , "+cadd+" , "+div);
	}
}