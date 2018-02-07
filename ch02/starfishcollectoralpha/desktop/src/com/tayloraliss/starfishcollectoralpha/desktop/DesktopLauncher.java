package com.tayloraliss.starfishcollectoralpha.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.tayloraliss.starfishcollectoralpha.StarfishCollectorAlpha;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Game myGame = new StarfishCollectorAlpha();
		LwjglApplication launcher = new LwjglApplication( myGame, "Starfish Collector", 800, 600 );
	}
}
