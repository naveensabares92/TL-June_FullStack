package com.fs.d04.java;

public class ElectronicGadgets {

	private String gadgetName;
	private double buyingPrice;
	private double sellingPrice;
	
	public ElectronicGadgets(String gadgetName, double buyingPrice, double sellingPrice) {
		this.gadgetName = gadgetName;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		System.out.println("Gadget- '" + this.gadgetName + "' price details: \n");
		System.out.println("Buying price is " + this.buyingPrice + " Selling price is " + this.sellingPrice);
	}

	public static void main(String[] args) {
		ElectronicGadgets name = new ElectronicGadgets("fan", 20.54, 30.50);
	}
	
}
