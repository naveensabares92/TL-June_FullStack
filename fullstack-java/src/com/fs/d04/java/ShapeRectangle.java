package com.fs.d04.java;

public class ShapeRectangle extends Shape {

	private Integer length;
	private Integer breath;
	
	public ShapeRectangle(Integer length, Integer breath) {
		super("Rectangle");
		this.length = length;
		this.breath = breath;
	}

	@Override
	public Double calculateArea() {
		return (double) (length * breath);
	}
}
