import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        // Creating the Scanner object to take input.
        Scanner input = new Scanner(System.in);

        // Taking variable number as input for user
        System.out.println("Enter Number: ");
        int number = input.nextInt();

        // Initializing sum to 0 
        int sum = 0;
        int tempNumber = number;

        // Extracting and adding each digit to the sum
        while (tempNumber > 0) {
            int digit = tempNumber % 10; 
            sum += digit;                 
            tempNumber = tempNumber / 10; 
        }

        // Checking the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }

    }
}
