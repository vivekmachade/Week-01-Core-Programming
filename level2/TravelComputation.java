class TravelComputation {
   
   public static void main(String[] args) {
	   
	   // Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);

       // Taking variable name,fromCity,viaCity and toCity as input for user
	   
	   System.out.println("write the name person traveling");
        String name = input.nextLine();
		
		System.out.println("which city from traveling");
        String fromCity = input.nextLine();
		
		System.out.println("which via traveling");
        String viaCity = input.nextLine();
		
		System.out.println("which to city traveling");
		String toCity = input.nextLine();
      
      double distanceFromToVia = 156.6;

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia = 4 * 60 + 4;

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity = 211.8;

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity = 4 * 60 + 25;

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
