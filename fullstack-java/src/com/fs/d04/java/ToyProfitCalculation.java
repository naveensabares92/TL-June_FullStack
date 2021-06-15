package com.fs.d04.java;

import java.text.DecimalFormat;

public class ToyProfitCalculation {

	private int numberOfDozens;
	private double costPricePerDozen;
	private double sellingPricePerPiece;
	
	// PARAMETERISED CONSTRUCTOR
	public ToyProfitCalculation(int numberOfDozens, double costPricePerDozen, double salesPricePerPiece) {
		this.numberOfDozens = numberOfDozens;
		this.costPricePerDozen = costPricePerDozen;
		this.sellingPricePerPiece = salesPricePerPiece;
	}

	// GETTERS		
	public int getNumberOfDozens() {
		return numberOfDozens;
	}
	

	public double getCostPricePerDozen() {
		return costPricePerDozen;
	}


	public double getSalesPricePerPiece() {
		return sellingPricePerPiece;
	}

	// SETTERS 
	public void setNumberOfDozens(int numberOfDozens) {
		this.numberOfDozens = numberOfDozens;
	}

	public void setCostPricePerDozen(double costPricePerDozen) {
		this.costPricePerDozen = costPricePerDozen;
	}

	public void setSalesPricePerPiece(double salesPricePerPiece) {
		this.sellingPricePerPiece = salesPricePerPiece;
	}

	
	// INSTANCE METHODS	
	public double profitCalculation() {
		double buyingPricePerPiece = 0;
		double profitPercentage = 0;
		double lossPercentage = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		buyingPricePerPiece = this.costPricePerDozen / 12;
		
		if((this.sellingPricePerPiece) > buyingPricePerPiece) {
			profitPercentage = ((this.sellingPricePerPiece - buyingPricePerPiece)/ buyingPricePerPiece) * 100;
			return Double.valueOf(df.format(profitPercentage));
		} else {
			lossPercentage = ((buyingPricePerPiece - this.sellingPricePerPiece) / this.sellingPricePerPiece) * 100;
			return Double.valueOf(df.format(lossPercentage));
		}
	}
	
	// MAIN METHOD
	public static void main(String[] args) {
		ToyProfitCalculation object = new ToyProfitCalculation(20, 375, 33);
		System.out.println("Number of dozens of toys purchased "+  object.numberOfDozens +";\nPrice per dozen " + object.costPricePerDozen 
				+ "; \nSelling price of 1 toy at " + object.sellingPricePerPiece +"\n\nSam's profit percentage is: " + object.profitCalculation() + " percent");
	}

	
}
