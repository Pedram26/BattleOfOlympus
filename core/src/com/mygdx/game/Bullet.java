package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by ppourdavood on 2/10/2015.
 */
public class Bullet {
    Vector2 speed;
    Texture img;
    public Rectangle bullet;

    public Bullet(){
        img = new Texture("bullet.jpg");
        speed = new Vector2(4,4);
    }

    public void render(SpriteBatch batch){
        batch.draw(img, bullet.getX(), bullet.getY(), bullet.getWidth(), bullet.getHeight());
    }
}