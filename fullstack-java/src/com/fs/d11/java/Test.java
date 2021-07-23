package com.fs.d11.java;

public class Test {
public static void main(String[] args) {
	int i = 010;
	int j = 7;
	System.out.println(i);
	System.out.println(j);
	Float f1 = new Float("3.0");
	System.out.println(f1);
	
	int i1 = f1.intValue();
	System.out.println(i1);
	byte b = f1.byteValue();
	double d = f1.doubleValue();
	System.out.println(i1+b+d);
}
}

