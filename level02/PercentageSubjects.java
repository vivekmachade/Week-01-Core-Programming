import java.util.Scanner;
class PercentageSubjects{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the Maths mark : ");
	  
	  // Taking variable Maths input for user
	  int maths = input.nextInt();
	  
	  System.out.print("Enter the chemistry mark : ");
	  
	  // Taking variable Maths input for user
	  int chemistry = input.nextInt();
	  
	   System.out.print("Enter the physics mark : ");
	  
	  // Taking variable Maths input for user
	  int physics = input.nextInt();
	  
	  // average of the subject
	  int percentage = (maths+chemistry+physics)/3;
	  
	  // student get 80 or higher
	  if(percentage>=80){
		  System.out.println("Grade : A \nRemarks : Level 4, Above agency-normalized standards");
	  }
	  
	   // student get 70 or higher
	 else if(percentage>=70){
		  System.out.println("Grade : B \nRemarks : Level 3, At agency-normalized standards");
	  }
	  
	  // student get 60 or higher
	  else if(percentage>=60){
		  System.out.println("Grade : C \nRemarks : Level 2, Below, but agency-normalized standards");
	  } 
	  
	   // student get 50 or higher
	  else if(percentage>=50){
		  System.out.println("Grade : D \nRemarks : Level 1, Well below agency-normalized standards");
	  }
	  
	  // student get 40 or higher
	 else if(percentage>=40){
		  System.out.println("Grade : E \nRemarks : Level 1-, Too below agency-normalized standards");
	  }
	  else{
		  System.out.println("Grade : R \nRemarks : Remedial standards");
	  }
	}
}
