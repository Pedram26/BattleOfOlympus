package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;


/**
 * Created by ppourdavood on 2/20/2015.
 */
public class HealthBar {
    Rectangle health;
    Rectangle health2;
    Texture img;
    Texture img2;

    public HealthBar(){
        health = new Rectangle(40 , 350 , 220, 100);
        health2 = new Rectangle(540, 350, 220, 100);
        img = new Texture("healthBarRegular.png");
        img2 = new Texture("healthBar.png");
    }

    public void render(SpriteBatch batch){
        batch.draw(img, health.getX(), health.getY(), health.getWidth(), health.getHeight());
        batch.draw(img2, health2.getX(), health2.getY(), health2.getWidth(), health2.getHeight());
    }
}

