import java.util.Scanner;
class LongestWord{
	//method for checking the string  sentence which word is largest
	public static void longWord(String text){
		
		// store the word in array index
	    String words[]=text.split(" ");
		int max = 0;
		
		// finding the numer of words in string word
		for(int index = 0;index<words.length;index++){
		  max = Math.max(max,words[index].length());
		}
		
		// checking which word is longest in strings
		for(int index = 0;index<words.length;index++){
			if(words[index].length()==max){
		System.out.println("Logest words of String is "+words[index]);
			}
		}
	
	}
	
	public static void main (String[] args){
		
		// Taking Scanner object for user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		// Taking string text as input for user
		String text = input.nextLine();
		
	     // calling method 
	    longWord(text);
	}
	}