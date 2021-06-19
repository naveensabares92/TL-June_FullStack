package com.fs.d04.java;

public class Product {
	
	// INSTANCE VARIABLES
	private long id;
	private String productName;
	private String supplierName;
	
	// DEFAULT CONSTRUCTOR
	public Product() {
		// TODO Auto-generated constructor stub
		this.id = 01;
		this.productName = "Wrench";
		this.supplierName = "SKF Product suppliers";
				
	}
	
	// PARAMETERISED CONSTRUCTOR
	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	//GETTERS
	public long getId() {
		return id;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	// SETTERS
	public void setId(long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	// INSTANCE METHODS
	void display() {
		System.out.println("Product ID is: " + this.id);
		System.out.println("Product Name is: " + this.productName);
		System.out.println("Supplier Name is: " + this.supplierName + "\n");
	}

	// MAIN METHOD TO CALL DEFAULT CONSTRUCTOR AND PRINT USING DISPLAY()
	public static void main(String[] args) {
		Product pdtSupplier = new Product();
		pdtSupplier.display();
	}

}
