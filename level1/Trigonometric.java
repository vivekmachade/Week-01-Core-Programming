import java.util.Scanner;
class Trigonometric{
	
	 public static double[] calculateTrigonometric(int angle) {
		 
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        
        return new double[] {sine, cosine, tangent};
    }
	
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// taking angle as input from the user
		
		System.out.print("Enter the angle in degrees : ");
		int angle = input.nextInt();
		
		double results[] = calculateTrigonometric(angle);
		
	
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
		
		
	}
}
