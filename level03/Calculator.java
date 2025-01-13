import java.util.*;

class Calculator{
    public static void main(String[] args) {
       // Creating the object of Scanner class for input
        Scanner input = new Scanner(System.in);

        // Taking variable number as input
        System.out.println("Enter the number of times you want to execute the calculator ");
        int number = input.nextInt();

        // Running a while loop 
        while (number-- > 0) {
            // Taking input as first and second
            System.out.println("Enter first number: ");
            int first = input.nextInt();
            System.out.println("Enter second number: ");
            int second = input.nextInt();
            
            // Taking input for the operation
            System.out.println("Choose which operation you want to perform -> +, -, *, / ");
            String operation = input.next();

            // Using switch case 
            switch (operation) {
                case "+":
                    System.out.println("Addition of these two numbers is " + (first + second));
                    break;
                case "-":
                    System.out.println("Subtraction of these two numbers is " + (first - second));
                    break;
                case "*":
                    System.out.println("Multiplication of these two numbers is " + (first * second));
                    break;
                case "/":
                    // Check for division by zero
                    if (second != 0) {
                        System.out.println("Division of these two numbers is " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid input found!!!");
                    break;
            }
        }

    }
}
