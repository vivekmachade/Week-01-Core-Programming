import java.util.Scanner;

public class ReplaceString {

    // Method to replace characters in a string
    static String replaceChar(String oldChar, String newChar, String myStr) {
        return myStr.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // taking user for input
        System.out.println("Enter the original string:");
        String myStr = input.nextLine();

        System.out.println("Which character do you want to replace in the string?");
        String oldChar = input.nextLine();

        System.out.println("What character should replace it?");
        String newChar = input.nextLine();

        // Call the replaceChar method and display the result
        String result = replaceChar(oldChar, newChar, myStr);
        System.out.println("Your new string after the replacement: " + result);

        input.close();
    }
}
