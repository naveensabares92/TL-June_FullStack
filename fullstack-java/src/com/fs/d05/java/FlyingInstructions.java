package com.fs.d05.java;

public class FlyingInstructions implements Fly {
		
	int currentSpeed;
	
	public FlyingInstructions() {
		System.out.println("How To Fly ? => Starting to provide flying instructions");
	}

	@Override
	public void startFlying() {
		currentSpeed = DEFAULT_SPEED;
	}

	@Override
	public void stopFlying() {
		System.out.println("Bird Stops Flying");
		currentSpeed = 0;
	}

	@Override
	public int getSpeed() {
		return currentSpeed;
	}

	@Override
	public int increaseSpeed(int speedToIncrease) {
		currentSpeed = currentSpeed + speedToIncrease;	
		return currentSpeed;
	}

	@Override
	public int decreaseSpeed(int speedToDecrease) {
		currentSpeed = currentSpeed - speedToDecrease;	
		return currentSpeed;
	}
}
