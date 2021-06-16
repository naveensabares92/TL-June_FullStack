package com.fs.d04.java;

import java.text.DecimalFormat;

public class DiscountAmountCalculation {
	static DecimalFormat df = new DecimalFormat("#.##");
	public static void main(String[] args) {
		
		float priceItem1 = 20.50F;
		float priceItem2 = 45.40F;
		int discountPercent = 10;
		
		double discountedPrice = Double.valueOf(getDiscountedAmount(priceItem1, priceItem2, discountPercent));
		
		System.out.println("Price of item 1: $" + priceItem1 + "\nPrice of item 2: $" + priceItem2 + 
				"\nDiscount in %: " +  discountPercent + "\n\nTotal amount: $" + (priceItem1+priceItem2) + 
				"\nDiscounted amount: $" + df.format((priceItem1+priceItem2)-discountedPrice) + "\nSaved amount: $" + discountedPrice);
		
	}
	
	public static String getDiscountedAmount(float priceItem1, float priceItem2, int discountPercent) {
		return df.format((priceItem1 + priceItem2) * (discountPercent/100.0));
	}
}
