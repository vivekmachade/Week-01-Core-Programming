import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionMock{

    // Method for generating ArrayIndexOutOfBoundsException
    public static void generatedArrayBoundsException(String[] namesArray, int index) {
        
		// Trying to access an index that is out of bounds of the array
        System.out.println("\nAccessing index " + index + ": " + namesArray[index]);
    }

    // Method for handling the exception using try-catch block
    public static void handleArrayBoundsException(String[] namesArray, int index) {
        try {
            // Calling the method to generate the exception
            generatedArrayBoundsException(namesArray, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArrayIndexOutOfBoundsException caught: The index " + index + " is out of bounds.");
        } 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		
		// Taking input for the array of names
        System.out.print("Enter the number of names you want to input : ");
        int numberOfNames = input.nextInt();
		
		// Array to store names input by the user
        String namesArray[] = new String[numberOfNames];
		
		
		// Storing a index to access the array and generate the ArrayIndexOutOfBoundsException 
        int indexToAccess = numberOfNames;
        input.nextLine(); // Consume the leftover newline character

        // Taking names input from the user
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            namesArray[i] = input.nextLine();
        }


		try{
			
			// First calling the method to generate the exception
			System.out.println("\nAttempting to generate ArrayIndexOutOfBoundsException...");
			generatedArrayBoundsException(namesArray, indexToAccess); // This will cause an exception if the index is out of bounds
		
		} catch(Exception e){
			
			// After the exception we call the method to handle it
			System.out.println("\nNow handling the exception...");
			handleArrayBoundsException(namesArray, indexToAccess); // This will catch and handle the exception
		}
	}
}
