package com.association;

public class Car {

	private int speed;
	
	private String color;

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void getDetails() {
		System.out.println("The car color: "+color+" & speed: "+speed);
	}
}
