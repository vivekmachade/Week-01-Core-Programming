import java.util.Scanner;
class SumInputNegative{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		
		
		
		// taking sum variable for store the sum number give by user
		double sum = 0;
		
		// Taking number as input from user
		System.out.println("Enter the number for sum \nFind the total sum Enter 0 or negative number ");
		
		// loop is continous run infinity unit user not break
		while(true){
		double number = input.nextDouble();
		
		//Adding the number give by user
		sum = sum+number;
		
		if(number<=0){
			break;
		}
		}
		System.out.println("Total sum "+ sum);
		
			
		}
	}