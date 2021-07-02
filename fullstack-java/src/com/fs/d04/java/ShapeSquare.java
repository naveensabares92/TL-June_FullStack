package com.fs.d04.java;

public class ShapeSquare extends Shape {

	private Integer side;
	
	public ShapeSquare(Integer side) {
		super("Square");
		this.side =  side;
	}

	@Override
	public Double calculateArea() {
		return (double) side * side;
	}	
}
