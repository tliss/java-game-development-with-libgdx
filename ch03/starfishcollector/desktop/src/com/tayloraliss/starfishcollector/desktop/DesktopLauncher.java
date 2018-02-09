package com.tayloraliss.starfishcollector.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.tayloraliss.starfishcollector.StarfishGame;

public class DesktopLauncher {
	public static void main(String[] args) {
		// To start a LibGDX program, this method:
		// (1) creates an instance of the game
		// (2) creates a new application with game instance and window settings as argument
		Game myGame = new StarfishGame();
		LwjglApplication launcher = new LwjglApplication(myGame, "Starfish Collector", 800, 600);
	}
}