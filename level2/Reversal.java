import java.util.*;

class Reversal {
    public static void main(String[] args) {
		
        // Creating the Scanner object to read input
        Scanner input = new Scanner(System.in);
        
		//taking variable number as input
		System.out.print("Enter the number ");
		int number = input.nextInt();
		
		int temp = number;
		
		// intialzing count for count the number digits
		int count=0;
		int remainder;
		
		for(int index =0 ; index<100;index++){
			remainder = temp%10;
			temp = temp/10;
			count++;
			if(temp ==0)break;
		}
		
		int reversal[] = new int[count];
		
		for(int index=0; index < count;index++){
			remainder = number%10;
			number = number/10;
			reversal[index]= remainder;
			System.out.print(reversal[index]+" ");
		}
			
    }
}