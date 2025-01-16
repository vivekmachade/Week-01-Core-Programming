import java.util.Scanner;

// mistake taking file name as NullPointerException 

class  StringIndexOutExample{
	
	// Method for creating null pointer exception
	public static void stringIndexException(String text){
	System.out.println(text.charAt(text.length()));
	}
	
	// method for handling the exception
	public static void stringIndexExceptionHandling(String text){
		
		try{
			//System.out.println(text.charAt(3));
			//method call stringIndexException 
			stringIndexException(text);
		}
		// catching the stringIndexOutofBoundsException
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index out of bounds Exception"+e);
		}
		
	}
		
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//taking text as input for user
		String text = input.nextLine();
		
		// method call StringIndexExceptionHandling
		stringIndexExceptionHandling(text);
		
	}
}