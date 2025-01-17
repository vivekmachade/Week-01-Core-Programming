import java.util.Scanner;
class CountString{
	
	public static void CountVowelsAndConsonants(String name){
		
		// assign vowelCount and consonantsCount for counting
		int vowelCount =0;
		int consonantsCount = 0;
		
		
		//Iterate the string length for single char 
		for(int index =0 ; index<name.length();index++){
			char spell = name.charAt(index);
			if(spell=='a'|| spell=='e' || spell=='i' || spell =='0' || spell =='u'){
				vowelCount++;
			}
			else{
				consonantsCount++;
			}
		}
		System.out.println(name +" has "+vowelCount+" vowels ");
		System.out.println(name +" has "+consonantsCount+" consonants ");
	}
			
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		// taking String name as user input
		System.out.println("Enter the String");
		
		String name = input.nextLine();
		
		 // Call the method to count vowels and consonants
		CountVowelsAndConsonants(name);
	}
}