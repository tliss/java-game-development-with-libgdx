package com.tayloraliss.mystarfishcollector;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class BaseActor extends Actor
{
    private Animation<TextureRegion> animation;
    private float elapsedTime;
    private boolean animationPaused;

    public BaseActor(float x, float y, Stage s)
    {
        // call constructor from Actor class
        super();
        // perform additional initialization tasks
        setPosition(x,y);
        s.addActor(this);
        animation=null;
        elapsedTime=0;
        animationPaused=false;
    }

    public void setAnimation(Animation<TextureRegion> anim){
        animation = anim;
        TextureRegion tr = animation.getKeyFrame(0);
        float w = tr.getRegionWidth();
        float h = tr.getRegionHeight();
        setSize(w, h);
        setOrigin(w/2, h/2);
    }
}
