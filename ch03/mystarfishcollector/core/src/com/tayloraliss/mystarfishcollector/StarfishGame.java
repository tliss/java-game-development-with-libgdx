package com.tayloraliss.mystarfishcollector;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StarfishGame extends GameBeta
{
	private Turtle turtle;
	private Shark shark;
	private ActorBeta starfish;
	private ActorBeta ocean;
	private ActorBeta winMessage;
	private ActorBeta gameOverMessage;

	private boolean win;
	private boolean gameOver;

	public void initialize()
	{
		ocean = new ActorBeta();
		ocean.setTexture( new Texture( Gdx.files.internal("water.jpg") )  );
		mainStage.addActor(ocean);

		starfish = new ActorBeta();
		starfish.setTexture( new Texture(Gdx.files.internal("starfish.png")) );
		starfish.setPosition( 380,380 );
		mainStage.addActor( starfish );

		turtle = new Turtle();
		turtle.setTexture( new Texture(Gdx.files.internal("turtle-1.png")) );
		turtle.setPosition( 20,20 );
		mainStage.addActor( turtle );

		shark = new Shark();
		shark.setTexture( new Texture(Gdx.files.internal("sharky.png")) );
		shark.setPosition(Gdx.graphics.getWidth() / 2 - shark.getWidth() / 2,  Gdx.graphics.getHeight() / 2 - shark.getHeight() / 2);
		mainStage.addActor( shark );

		winMessage = new ActorBeta();
		winMessage.setTexture( new Texture(Gdx.files.internal("you-win.png")) );
		winMessage.setPosition( 180,180 );
		winMessage.setVisible( false );
		mainStage.addActor( winMessage );

		gameOverMessage = new ActorBeta();
		gameOverMessage.setTexture( new Texture(Gdx.files.internal("game-over.png")) );
		gameOverMessage.setPosition(180, 180);
		gameOverMessage.setVisible( false );
		mainStage.addActor( gameOverMessage );

		win = false;
		gameOver = false;
	}

	public void update(float dt)
	{
		// check win condition: turtle must be overlapping starfish
		if (turtle.overlaps(starfish))
		{
			starfish.remove();
			winMessage.setVisible(true);
		}

		if (turtle.overlaps(shark)){
			shark.remove();
			gameOverMessage.setVisible(true);
		}
	}
}
