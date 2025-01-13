class VolumeEarth{
	public static void main(String[] args){
		
		//radius of earth is 6378
		double radius = 6378;
		
		double pi = 3.14;
		
		// volume of Sphere(Earth) = (4/3)*pi*radius^3
		double volume = (4/3)*pi*radius*radius*radius;
		
		// 1 kilometers = 0.6 miles
		double miles  = volume*0.6;
		
		System.out.println("The volume of earth in cubic kilometers is "+ volume + " and cubic miles is " +miles);
	}
}
		