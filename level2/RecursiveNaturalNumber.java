import java.util.Scanner;

class RecursiveNaturalNumber{
	
	public static int sum(int number){
		if(number <= 1){
			return number;
		}
		return number + sum(number-1);
	}
	
	public static int totalSum(int number){
		int total = number * (number+1) / 2;
		return total;
	}
	
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a natural number :");
		int number = input.nextInt();
		
		System.out.println("Sum of n natural number by using recursion is :" + sum(number));
		
		System.out.println("Sum of n natural number by using loop is :" + totalSum(number));
		
		if(sum(number) == totalSum(number)){
			System.out.print("Both results is same :" + totalSum(number));
		}else{
			System.out.print("results are different ");
		}
		
	}
}
