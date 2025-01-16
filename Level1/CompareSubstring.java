/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.Scanner;
class CompareSubString{

   // method for creating sub string using chartAt();
	public static String charMethod(String str1, int index, int endIndex){
		 StringBuilder newStringsub = new StringBuilder();
        
		for (int i= index; i < endIndex; i++) {
            newStringsub.append(str1.charAt(i));
        }
        
		return newStringsub.toString();
    }
	
	//method for checking charAt substring and inbuilt substring is equal
	public static boolean isCharEqualSub(String str1, String str2){
		
     if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args){
		
		//Taking Scanner object 
	 Scanner input = new Scanner(System.in);
	 
	 // Taking String1 as input for user
	 System.out.println("Enter the String: ");
	 String str1 = input.next();
	 
	 System.out.println("Enter the starting index ");
	 int index = input.nextInt();
	 
	 System.out.println("Enter the end index ");
	 int endIndex = input.nextInt();
	 
	 // Creating substring using charAt() method
     String substringUsingCharAt = charMethod(str1, index, endIndex);

        
	  // Creating substring using built-in substring() method
     String substringUsingBuiltInMethod = str1.substring(index, endIndex);

        
	   // Comparing the two substrings
     boolean isEqualUsingCharAt =isCharEqualSub(substringUsingCharAt, substringUsingBuiltInMethod);


        // Displaying results
      System.out.println("Substring using charAt() method: " + substringUsingCharAt);
     System.out.println("Substring using built-in substring() method: " + substringUsingBuiltInMethod);
     System.out.println("Comparison result: " + isEqualUsingCharAt);

     if (isEqualUsingCharAt) {
        System.out.println("Both methods produce the same result");
      } else {
        System.out.println("Methods produce different results");
	  }
	 
	}
}
