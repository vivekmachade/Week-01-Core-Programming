class Discounted {
	public static void main(String[] args){
        
		// Multiline Variable fee and discount
		int fee = 125000, discountPercentage = 10;
		
		//offer discount percentage
	   double discountFee = (fee*discountPercentage)/100;
		
		//fee after discount
		double totalFee = fee - discountFee;
		
		System.out.println("The discount amount is INR "+discountFee+" and final discounted fee in INR "+totalFee);
	}
}

		