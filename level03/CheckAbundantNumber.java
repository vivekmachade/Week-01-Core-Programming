import java.util.Scanner;

class CheckAbundantNumber{
    public static void main(String[] args) {
        // Creating the Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Taking variable number as input
        System.out.println("Enter Number ");
        int number = input.nextInt();

        // Initializing sum to 0
        int sum = 0;

        // Finding the sum of divisors 
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  
            }
        }

        // Checking the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("abundant number");
        } else {
            System.out.println("Not an abundant number");
        }

    }
}
