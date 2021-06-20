package com.fs.d05.java;


public interface Fly {

	int DEFAULT_SPEED = 50;
	
	void startFlying();
	
	void stopFlying();
	
	int getSpeed();
	
	int increaseSpeed(int speedToIncrease);
	
	int decreaseSpeed(int speedToDecrease);
}
