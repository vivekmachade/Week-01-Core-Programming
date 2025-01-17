import java.util.Scanner;
class ReversalStrings{
	
	public static void ReversalString(String name){
		
		// assign the new String for storing Reversal strings
		String reversalName="";
		
		// iterater the string end to first and write the strings
		for(int index=name.length()-1; index>=0;index--){
			char ch = name.charAt(index);
		  reversalName+=ch;
			
		}
		System.out.println(name +" has reversal is "+reversalName);
	}

			
		
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		// taking String name as user input
		System.out.println("Enter the String :");
		
		String name = input.nextLine();
		
		// call method for reversal strings
		ReversalString(name);
	}
}