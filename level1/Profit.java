class Profit{
	public static void main(String[] args){
      
	  //Multiline Variable Cost price and Selling price 
		double costPrice = 129, sellingPrice = 191;
        
		// Total Profit
		double profit = sellingPrice-costPrice;
		
		// Profit Percentage 
		double profitPercentage = profit/costPrice*100;

		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price in INR "+ sellingPrice + "\nThe Profit in INR " + profit + " and the Profit Percentage is "+profitPercentage);
    }
}
