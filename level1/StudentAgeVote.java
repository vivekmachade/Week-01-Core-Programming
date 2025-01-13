import java.util.Scanner;
class StudentAgeVote{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  // creating an array of ages
	  int studAge[] = new int[10];
	  
	  // loop for input for get student age
	  for(int currentPostion=0; currentPostion<studAge.length;currentPostion++){
        
		// taking StudAge as input
		System.out.print("\nEnter student age : ");
	    studAge[currentPostion]= input.nextInt();
	  }
        // check eligibility for voting
	    for(int currentPostion=0; currentPostion<studAge.length;currentPostion++){
		
		if(studAge[currentPostion]>=18){
			
			System.out.println("The student with the age "+studAge[currentPostion]+" can vote ");
		}
		else{
			
			System.out.println("The student with the age "+studAge[currentPostion]+" cannot vote ");
		}
	  }
	}
}
		
       	   
	  