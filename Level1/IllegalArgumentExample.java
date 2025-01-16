 /*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
 import java.util.Scanner;

class  IllegalArgumentExample{
	
	// Method for creating null pointer exception
	public static void illegalException(String text){
	    System.out.println(text.substring(2,1));
	}
	
	// method for handling the exception
	public static void illegalExceptionHandling(String text){
		
		try{
			//System.out.println(text.charAt(3));
			// calling method illegalException
			illegalException(text);
		}
		// catching illegalException 
		catch( IllegalArgumentException e){
			System.out.println(" IllegalArgumentException catch"+e);
		}
		// catching RuntimeException
		catch(RuntimeException e){
			System.out.println("Runtime exception catch "+e);
		}
		
	}
		
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string "0);
		// Taking String text as input for user
		String text = input.nextLine();
		
		// calling method IllegalExceptionHandling
        illegalExceptionHandling(text);
		
	}
}