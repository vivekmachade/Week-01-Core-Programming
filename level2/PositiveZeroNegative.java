import java.util.*;
class PositiveZeroNegative{
	
		// checking the number is positive or negative or zero
	public static String isPositive(int Numbers) {
        if (Numbers < 0)return "Negative";
        else if (Numbers > 0) return "Positive";
        else return "Zero";
        
    }
	
	 // checking number is even or odd
	public static String isEven(int Numbers) {
		 if(Numbers%2==0)return "Even";
         else return "Odd";
	 }
	  // comparing two number 
	 public static int compare(int firstNum,int lastNum){
		 if (firstNum > lastNum) return 1;
		 else if (firstNum < lastNum) return -1;
		 else return 0;
	 }
	 	
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Initialising the array which will contain all the Numbers
		int Numbers[] = new int[5];
		
		// Taking Numbers as input from the user
		for(int index = 0; index < 5; index++){
			System.out.print("Enter the number "+(index+1)+" ");
			Numbers[index] = input.nextInt();
		}
		
		// Traversing the array of Numbers to check 
		  for (int index = 0; index < 5; index++) {
            String result = isPositive(Numbers[index]);
            System.out.println("Number " + Numbers[index] + " is " + result);

            if (Numbers[index] != 0) {  // Only check even/odd if number is not zero
                String evenOrOdd = isEven(Numbers[index]);
                System.out.println("Number " + Numbers[index] + " is " + evenOrOdd);
            }
        }
		
		// Comparing first and last Numbers
		int firstNum = Numbers[0], lastNum = Numbers[4];
		
		int comparisonResult = compare(firstNum, lastNum);
		
		if(comparisonResult == 1) System.out.print("The first number is greater than the last number");
		else if(comparisonResult == -1) System.out.print("The first number is smaller than the last number");
		else System.out.print("The first number is equal to the last number");
	}
}