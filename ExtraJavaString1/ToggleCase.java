/*7. Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.*/

import java.util.Scanner;
class ToggleCase{
	
	public static void toggle(String text){
		
		String tog = "";		
		for(int i = 0; i <text.length();i++){
			char ch = text.charAt(i);
			if(ch == Character.toLowerCase(ch))
			{
				tog += Character.toUpperCase(ch);
			}
			else{
				tog+=Character.toLowerCase(ch);
			}
		}
		System.out.println(text+" is toggle word is "+ tog);
	
		
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word for toggle : ");
		
		// Taking variable text as input for user
		String text = input.next();
		
		toggle(text);
		
	}
}
