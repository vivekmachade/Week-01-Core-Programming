import java.util.Scanner;
class PalindromeString{
	
	public static boolean isPalindrome(String lowerName){
		
		// we have give string length
		int left = 0;
		int right = lowerName.length()-1;
		
		while(left<right){
		if(lowerName.charAt(left)!=lowerName.charAt(right)){
	       return false;
		}
		 left++;
		 right--;
		 
		}
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		// taking String name as user input
		System.out.println("Enter the String :");
		
		String name = input.nextLine();
		
		String lowerName = name.toLowerCase();
		
		// call method for reversal strings
		if(isPalindrome(lowerName))System.out.println(lowerName+" this string is palindrome String");
		else System.out.println(lowerName+" this string is not palindrome String");
	}
}