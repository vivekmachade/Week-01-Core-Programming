import java.util.Scanner;

class CheckArmstrongNumber{
    public static void main(String[] args) {
        // Creating the Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Taking variable number as input
        System.out.println("Enter a number : ");
        int number = input.nextInt();

        // Initializing variables
        int sum = 0; 
        int originalNumber = number; 

        // Using while loop 
        while (originalNumber != 0) {
            
			// calculating single digit of number
            int digit = originalNumber% 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }

        // Checking sum equal to number
        if (sum == number) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.out.println(number + " is not an armstrong number.");
        }

    }
}
