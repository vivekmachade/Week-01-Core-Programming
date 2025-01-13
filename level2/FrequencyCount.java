import java.util.Scanner;

class FrequencyCount{
	public static void main(String [] args){
		//create an scanner object user input
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Create an array to store the frequency of each digit 
        int[] frequency = new int[10];

        // Find the digits of the number and update the frequency array
        while (number > 0) {
            int digit = number % 10; 
            frequency[digit]++; 
            number /= 10; 
        }

        // Display the frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { 
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
	}
}