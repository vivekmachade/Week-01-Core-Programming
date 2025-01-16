import java.util.Scanner;

// mistake taking file name as NullPointerException 

class  NullPointerExmple{
	
	// Method for creating null pointer exception
	public static void nullException(String text){
	System.out.println(text.charAt(2));
	}
	
	// method for handling the exception
	public static void nullExceptionHandling(String text){
		
		try{
			//System.out.println(text.charAt(3));
			//method calling nullException
			nullException(text);
		}
		// catching the null pointer exception
		catch(NullPointerException e){
			System.out.println("null pointer Exception"+e);
		}
		// catching the Exception
		catch(Exception e){
			System.out.println(e+ " other Exception Caught");
		}

	}
		
	
	public static void main (String[] args){
		// taking null string
		String text = null;
		
		//method calling nullExceptionHandling
		nullExceptionHandling(text);
		
	}
}