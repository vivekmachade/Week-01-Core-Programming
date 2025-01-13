import java.util.Scanner;

class MeanHeight{
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//define a array on length 11
		double height[] = new double[11];
		double heightSum = 0;
		
		System.out.print("Enter the height of 11 players :");
		//loop for taking input of array elements
		//loop for compute the sum of all players height
        for(int i =0;i<height.length;i++){
			height[i] = scan.nextDouble();
			heightSum += height[i];
		}
		
		double mean = heightSum / 11;
		
		System.out.println("The mean height of the football team is : " + mean);
	}
}