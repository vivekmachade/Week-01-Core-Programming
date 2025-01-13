import java.util.Scanner;
class DiscountedInput {
	public static void main(String[] args){
        
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your fee");
		//taking fee as input
		int fee = input.nextInt();
		
		System.out.println("What is your percentage of discount");
		//taking discount percentage as input
		int discountPercentage = input.nextInt();
		
		//offer discount percentage
	   double discountFee = (fee*discountPercentage)/100;
		
		//fee after discount
		double totalFee = fee - discountFee;
		
		System.out.println("The discount amount is INR "+discountFee+" and final discounted fee in INR "+totalFee);
	}
}

		