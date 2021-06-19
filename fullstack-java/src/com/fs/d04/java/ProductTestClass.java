package com.fs.d04.java;

public class ProductTestClass {
	public static void main(String[] args) {
		
		System.out.println("*** Display the product & details using parameterised Constructor ***");
		Product pdtParameterisedObj = new Product(20, "Hammer", "Hammer Industries");
		pdtParameterisedObj.display();

		System.out.println("*** Display the product & details using default Constructor ***");
		Product pdtDefaultObj = new Product();
		pdtDefaultObj.display();
		
		System.out.println("*** Display the product & details using Getters & Setters ***");
		Product pdtGetterSetter = new Product();
		pdtGetterSetter.setId(30);
		pdtGetterSetter.setProductName("Shield");
		pdtGetterSetter.setSupplierName("Hydra");
		
		System.out.println("Product ID is: " + pdtGetterSetter.getId() 
				+ "\nProduct Name is: " + pdtGetterSetter.getProductName() 
					+ "\nSupplier Name is: " + pdtGetterSetter.getSupplierName());
	}

}
