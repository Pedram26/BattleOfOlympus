package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.awt.*;

/**
 * Created by pmp76_000 on 2/7/2015.
 */
public class Blade {
    Rectangle blade;
    Vector2 speed;
    Texture img;

    public Blade(){
        blade = new Rectangle(360, 320, 80, 120);
        img = new Texture("blade.png");
        speed = new Vector2(10 , 10);
    }

    public void render(SpriteBatch batch){
        batch.draw(img, blade.getX(), blade.getY(), blade.getWidth(), blade.getHeight());
    }
}

