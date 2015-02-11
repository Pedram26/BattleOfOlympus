package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by ppourdavood on 2/6/2015.
 */
public class Zeus {
    public Rectangle zeus;
    Texture img;
    Vector2 speed;
    Boolean changeOfSpeed;

    public Zeus(){
        zeus = new Rectangle(50, 50, 110, 170);
        img = new Texture("zeus.jpg");
        speed = new Vector2(9, 9);
    }

    public void render(SpriteBatch batch) {


        if (zeus.getY() + zeus.getHeight() < Gdx.graphics.getHeight()) {
            if (Gdx.input.isKeyPressed(Input.Keys.W)) {
                zeus.setY(zeus.getY() + speed.y);
            }
        }

        if(zeus.getY() > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.S)) {
                zeus.setY(zeus.getY() - speed.y);
            }
        }

        if(zeus.getX() + zeus.getWidth() < Gdx.graphics.getWidth()) {
            if (Gdx.input.isKeyPressed(Input.Keys.D)) {
                zeus.setX(zeus.getX() + speed.x);
            }
        }

        if(zeus.getX() > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.A)) {
                zeus.setX(zeus.getX() - speed.x);
            }
        }
            batch.draw(img, zeus.getX(), zeus.getY(), zeus.getWidth(), zeus.getHeight());
        }
    }

