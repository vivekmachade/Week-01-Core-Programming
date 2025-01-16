import java.util.Scanner;

public class StringLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { // Loop through characters till exception occurs
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception indicates end of string
        }
        return count; // Return the counted length
    }

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.next();

        int customLength = findLength(userInput);
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + userInput.length());
    }
}