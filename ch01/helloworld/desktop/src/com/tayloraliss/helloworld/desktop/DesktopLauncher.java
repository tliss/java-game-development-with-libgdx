package com.tayloraliss.helloworld.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.tayloraliss.helloworld.HelloWorldImage;

public class DesktopLauncher
{
	public static void main (String[] args)
	{
		// To start a LibGDX program, this method:
		// (1) creates an instance of the game
		// (2) creates a new application with game instance as argument
		HelloWorldImage myProgram = new HelloWorldImage();
		new LwjglApplication( myProgram );

	}
}