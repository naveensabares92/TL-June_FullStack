package com.fs.d04.java;

public class ShapeCircle extends Shape {

	private Integer side;
	
	public ShapeCircle(Integer side) {
		super("Circle");
		this.side = side;
	}
	
	@Override
	public Double calculateArea() {
		return (double) (Math.PI * (side * side));
	}
}
