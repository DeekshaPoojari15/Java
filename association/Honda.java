package com.association;

public class Honda extends Car {
	
	public void hondaEngine() {
		Engine engine=new Engine();
		engine.carEngine();
	}
	
	public void hondaMusicPlayer() {
		MusicPlayer musicplayer=new MusicPlayer();
		musicplayer.carMusicPlayer();
	}

}
