import java.util.Scanner;
class HandShakes{
	
	public static int noHand(int noStudent){
		// maximum number of possible handshakes
		int handshakes = (noStudent * (noStudent - 1)) / 2;
		
		return handshakes;
		
	}
		
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of student");
		
		//Taking number of student as input from user
		int noStudent = input.nextInt();
		
		// calling methode
		int result = noHand(noStudent);
		
		System.out.println("the number of possible handshakes "+result+" if number of student is "+noStudent);
	}
}