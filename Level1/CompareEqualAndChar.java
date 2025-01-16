 /*Q 1 Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/

import java.util.Scanner;
class CompareEqualAndChar{
	
	//method for checking str1 and str2 string same
	public static boolean charMethod(String str1,String str2){
		
		//checking length of str2 and str1 is same 
		if(str1.length()!=str2.length()){
			return false;
		}
		// checking character is similiar to str1 and str2
		for(int i =0; i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args){
		
		//Taking Scanner object 
	 Scanner input = new Scanner(System.in);
	 
	 // Taking String1 and string2 as input for user
	 System.out.println("Enter the String number 1: ");
	 String str1 = input.next();
	 
	 System.out.println("Enter the String number 1: ");
	 String str2 = input.next();
	 
	 // Taking String str1 and str2 is true or false 
	 // method call for CharAt methode
	 boolean CharMethod = charMethod(str1,str2);
	 
	 //checking str1 and str2 using equals in built feature
	 boolean EqualMethod = str1.equals(str2);

	 // checking the equal method or charAt methode same or not
	 System.out.println(" result the CharAt is : "+ CharMethod);
	 System.out.println(" result the Equal in built  is : "+EqualMethod);
	 
	 if(CharMethod == EqualMethod){
		 System.out.println(" this campare is same ");
	 }
		 else{
			 System.out.println(" this campare is not same ");
		 }
	}
}