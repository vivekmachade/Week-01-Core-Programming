import java.util.Scanner;

class MaxDigitNew {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Define an array to store the digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Variables to keep track of the array index
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit]; 
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; 
            }

            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }

        // Variables to store the largest and second-largest digits
        int largest = -1; 
        int secondLargest = -1; 

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Digits stored in the array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);

        if (secondLargest == -1) {
            System.out.println("No second largest digit found ");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}
