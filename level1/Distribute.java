class  Distribute {
	public static void main(String[] args){

		int pens = 14 , students = 3;
        
		// Distributed pens between students
		int distribute = pens/students;
		
		//Remaining non-distributed pens 
		int nonDistribute = pens%students;

		System.out.println("The Pen Per Student is " + distribute + " and the remaining pen not distribute is " + nonDistribute);
    }
}