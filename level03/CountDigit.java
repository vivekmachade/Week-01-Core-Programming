import java.util.Scanner;

class CountDigit {
    public static void main(String[] args) {
        // Creating the Scanner object to take input.
        Scanner input = new Scanner(System.in);

        // Taking variable number as input
        System.out.println("Enter the Number: ");
        int number = input.nextInt();

        // Initializing count to 0
        int count = 0;

        // Extracting and counting each digit count
        while (number > 0) {
            number = number / 10;
            count++;
        }

        // Printing the digit count 
        System.out.println("Digit count for the given input is: " + count);

        
    }
}
