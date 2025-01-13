import java.util.Scanner;
class FeetToInches{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What your height in cm");
		// Taking Height in cm
		double height = input.nextInt();
		
		/* convert cm to inches
		 1 inche = 2.54cm;
		 */
		 double inches = height/2.54;
		 
		 //convert inches into foot 
		 // 1 foot = 12 inches
		 int feet = (int)inches/12;
		 
		 // Remaining inches
		 int feetInches =(int) inches %12;
		 
		System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+feetInches);
	}
}
		 
		