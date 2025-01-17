import java.util.Scanner;
class Lexicographically {
    static String isStringLexi(String text1,String text2) {

        if (text1.length() > text2.length()) {

            // swapping text1 and text2
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }


        for (int index = 0; index < text1.length(); index++) {
            if (text1.charAt(index) < text2.charAt(index)) {
                return text1;
            } else if (text1.charAt(index) > text2.charAt(index)) {
                return text2;
            }
        }
        return text1;
    }



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first text ");
        String text1 = input.nextLine();

        System.out.println("Enter the Second text ");
        String text2 = input.nextLine();

         String result = isStringLexi(text1,text2);

         String greater ;

         if(result == text1){
             greater = text2;
         }
         else{
             greater = text1;
         }

        System.out.println(result+ " comes before " +greater+ " in lexicographical order ");

    }
}
