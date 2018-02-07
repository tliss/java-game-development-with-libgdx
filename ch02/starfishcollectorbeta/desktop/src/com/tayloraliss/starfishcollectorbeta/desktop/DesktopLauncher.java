package com.tayloraliss.starfishcollectorbeta.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.tayloraliss.starfishcollectorbeta.StarfishCollectorBeta;
import com.badlogic.gdx.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		// To start a LibGDX program, this method:
		// (1) creates an instance of the game
		// (2) creates a new application with game instance as argument
		Game myGame = new StarfishCollectorBeta();
		LwjglApplication launcher = new LwjglApplication( myGame, "Starfish Collector", 800, 600 );
	}
}
