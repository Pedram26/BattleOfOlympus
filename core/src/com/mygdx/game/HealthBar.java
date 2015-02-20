package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.awt.*;

/**
 * Created by ppourdavood on 2/20/2015.
 */
public class HealthBar {
    Rectangle health;
    Texture img;

    public HealthBar(){
        health = new Rectangle(50 , 50 , 200, 100);
        img = new Texture("healthBar.jpg");
    }

    public void render(SpriteBatch batch){
        batch.draw(img, health.getX(), health.getY(), health.getWidth(), health.getHeight());
    }
}

