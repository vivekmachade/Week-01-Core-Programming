import java.util.Scanner;
class NaturalNumber{
	
	public static int natural(int number){
		int sum = 0;
		if(number>0){
		for(int index=1;index<=number;index++){
			sum = index +sum;
			
		}
		}
		return sum;
	
	}
	
    public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// taking number as input from the user
		System.out.print("Enter the number for sum of natural number : ");
		int number = input.nextInt();
		
		//methode calling
		int result = natural(number);
		
		System.out.println("Sum of Natural number ");
		System.out.println(result);
	 }
}
