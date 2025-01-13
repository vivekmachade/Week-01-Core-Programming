import java.util.Scanner;
class BonusEmployees{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	 
	  System.out.print("Enter Employees salary : ");
	  
	  // Taking Salary as input for user
	  int salary = input.nextInt();
	  
	   System.out.print("Enter Employees service year : ");
	  
	  // Taking Service year as input for user
	  int serviceYear = input.nextInt();
	  
	 // Employees who get bonus 
	  if(serviceYear>5){
		  
	 // find the bonus in salary
	  int bonusPercentage = 5;
	  int bonusSalary = (salary*5)/100;
	  
	  // total salary with bonus
	  int getSalary = salary+bonusSalary;
	  
	  System.out.println("bonus amount : "+bonusSalary+" total salary with bonus "+getSalary);
	  }
	  else{
		 System.out.println("There will no bonus for this Employees ");
	}
}
	  
		  