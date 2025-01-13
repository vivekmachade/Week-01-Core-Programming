import java.util.*;

class MaxDigit {
    public static void main(String[] args) {
		
        // Creating the Scanner object to read input
        Scanner input = new Scanner(System.in);
        
		//taking variable number as input
		System.out.print("Enter the number ");
		long number = input.nextInt();
		
	    // Creating Array MaxDigit
		int maxDigit[] = new int[10];
		
		for(int i = 0;i<maxDigit.length;i++){
		maxDigit[i] = -1;
		}
		
		int reminder ;
		
		// Storay digit number in Array 
		for(int index =0;index<=10 && number>0;index++){
			

			
			reminder = number%10;
			number = number/10;
			maxDigit[index]= reminder;
			
		}                                   // 0 1 2
		int largest = maxDigit[0];          // 9 7 9
		int secondLargest = -1;
		//for(int i = 0;i<maxDigit.length;i++){
		//System.out.println(maxDigit[i]);
		//}
		
		int largestindex = 0;
		
		// Finding  Largest Array
		for(int index =0;index<10;index++){
			if(largest<maxDigit[index] && maxDigit[index] != -1){
				largest = maxDigit[index];
				largestindex = index;
			}
		}
		
		 
		// Find SecondLargest Array
		for(int index =0;index<10;index++){
			
			   if(index != largestindex && maxDigit[index] != -1){
			     if (secondLargest<maxDigit[index]){
				    secondLargest = maxDigit[index];
			     }
			}
		}
		
		     // Display the Largest and SecondLargest
        System.out.println("The Largest is " + largest);
        System.out.println("The SecondLargest is " + secondLargest);
			
    }
}