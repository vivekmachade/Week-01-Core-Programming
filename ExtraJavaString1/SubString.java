import java.util.Scanner;
class SubString{
	//method for checking the string  sentence which word is largest
	public static int subString(String text,String subText){
	 int count = 0;
	 int sizesub =subText.length();
	 
	 for( int i=0;i<text.length() && i+sizesub <= text.length();i++){
		String subString = text.substring(i,i+sizesub);
		
		//System.out.println("subString : " + subString + " <-> " + subText);
		
		 if(subString.equals(subText)){
		 count++;
		 }
	}
	return count;
	}
	
	public static void main (String[] args){
		
		// Taking Scanner object for user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the sentence as string : ");
		// Taking string text as input for user
		String text = input.nextLine();
		
		System.out.println("Enter the substring : ");
		// Taking string text as input for user
		String subText = input.nextLine();
		
	     // calling method 
	   int result = subString(text,subText);
	   System.out.println("the substring of string is "+result);
	}
	}