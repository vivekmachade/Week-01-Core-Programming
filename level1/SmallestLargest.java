import java.util.Scanner;
class SmallestLargest{
	
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	 
     	int smallest = Math.min(number1,Math.min(number2,number3)); 
		int largest = Math.max(number1,Math.max(number2,number3)); 
		
		return new int []{smallest,largest};
     
	}

	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// taking number 1,number2 and number 3 as input from the user
		
		System.out.print("Enter the number 1 ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the number 2 ");
		int number2 = input.nextInt();
		
		System.out.print("Enter the number 3 ");
		int number3 = input.nextInt();
		
		int SmallestLargest[] = findSmallestAndLargest(number1,number2,number3);
		
		
		System.out.print("The smallest number is "+SmallestLargest[0]+" and \nLargest number is "+SmallestLargest[1]);
		
		
	}
}
