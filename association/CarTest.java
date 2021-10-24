package com.association;

public class CarTest {
	
	public static void main(String [] args) {
		
		Honda hondaAmaze=new Honda();
		hondaAmaze.setColor("White");
		hondaAmaze.setSpeed(180);
		hondaAmaze.getDetails();
		hondaAmaze.hondaEngine();
		hondaAmaze.hondaMusicPlayer();
		
		Honda hondaJazz=new Honda();
		hondaJazz.setColor("Black");
		hondaJazz.setSpeed(200);
		hondaJazz.getDetails();
		hondaJazz.hondaEngine();
	}

}
