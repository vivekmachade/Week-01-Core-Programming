import java.util.Scanner;
class RemoveString {

    static String  RemoveChar(String str, char removeChar){

        StringBuilder newStr = new StringBuilder();
        for(int index = 0; index<str.length();index++){
            if(str.charAt(index)!= removeChar){
                newStr.append(str.charAt(index));
            }

        }
        return newStr.toString();
    }



    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your String ");
        String str = input.nextLine();

        System.out.println("Enter Which char you want remove from "+str);
        char removeChar = input.next().charAt(0);

        String result = RemoveChar(str,removeChar);

        System.out.println("After the Remove the char in String is "+result);


    }
}
