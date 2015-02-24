package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by pmp76_000 on 2/23/2015.
 */
public class Lightning {
    public Rectangle bolt;
    Vector2 speed;
    Texture img;

    public Lightning(){
    speed = new Vector2(10, 10);
    img = new Texture("lightningBolt.png");
    }

    public void render(SpriteBatch batch){
        batch.draw(img, bolt.getX(), bolt.getY(), bolt.getWidth(), bolt.getHeight());
    }
}
