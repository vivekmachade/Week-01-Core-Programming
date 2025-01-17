/*9. Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"

Expected Output:
Most Frequent Character: 's' */

import java.util.Scanner;
class FrequentChar{

static char Frequent(String text){
 
  char ch = '0';
  int max = 0;

  for(int i = 0; i<text.length();i++){
    int count = 0;
    for(int j =0;j<text.length();j++){
      
      if(text.charAt(i)==text.charAt(j)){
        count++;
      }

    }
    if(count>max){
      max = count;
      ch = text.charAt(i);
    }

  }

  return ch;
}


  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the String ");

    String text = input.nextLine();

    char ch = Frequent(text);
     
    System.out.println("The maximun frequenty of string is "+ ch);

  }
}