package com.fs.d05.java;

public class GenericsTryOut<K , T> {
	public void display(T... t) {
		System.out.println(t);
	}
	
	private int id;
	private String name;
	
	
	public void display(int id, String name,T t) {
		this.id = id;
		this.name = name;
		System.out.println("ID: " + this.id + "\n");
		System.out.println("NAME: " + this.name + "\n");
		System.out.println(t);
	}
	
//	public void display(T... t) {
//		System.out.println(t);
//	}
//	
	public void display(K k, T t) {
		System.out.println(k);
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		Runtime obj = Runtime.getRuntime();
	}
}
