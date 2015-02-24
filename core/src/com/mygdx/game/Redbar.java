package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by ppourdavood on 2/23/2015.
 */
public class Redbar {
    Rectangle redBar;
    Rectangle redBar2;
    Texture img;
    Texture img2;


    public Redbar(){
        redBar = new Rectangle(91, 395, 0, 23);
        redBar2 = new Rectangle(699, 395, 10, 23);
        img = new Texture("redBar.png");
        img2 = new Texture("redBar.png");
    }

    public void render(SpriteBatch batch){
        batch.draw(img,redBar.getX(), redBar.getY(), redBar.getWidth(), redBar.getHeight());
        batch.draw(img2,redBar2.getX(), redBar2.getY(), redBar2.getWidth(), redBar2.getHeight());
    }
}
