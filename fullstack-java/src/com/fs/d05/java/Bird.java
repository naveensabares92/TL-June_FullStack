package com.fs.d05.java;

public class Bird {
	Bird() {
		System.out.println("Bird Starts Flying");
	}

	public static void main(String[] args) {
		System.out.println("Implement Bird Flying");
		FlyingInstructions birdObj = new FlyingInstructions();
		
		birdObj.startFlying();
		
		System.out.println("Current Bird Speed; " + birdObj.getSpeed());
		
		System.out.println("Increase Bird Speed; " +birdObj.increaseSpeed(10));
		
		System.out.println("Current Bird Speed; " +birdObj.getSpeed());
		
		System.out.println("Decrease Bird Speed; " +birdObj.decreaseSpeed(10));
		
		System.out.println("Current Bird Speed; " +birdObj.getSpeed());
		
		birdObj.stopFlying();	
	}
}
