package com.tayloraliss.mystarfishcollector.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tayloraliss.mystarfishcollector.StarfishCollector;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Game myGame  = new StarfishCollector();
		LwjglApplication launcher = new LwjglApplication(myGame, "Starfish Collector", 800, 600);
	}
}
