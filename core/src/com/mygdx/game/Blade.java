package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
        blade = new Rectangle(350, 350, 80, 120);
        img = new Texture("blade.png");
        speed = new Vector2(10 , 10);
    }

    public void render(SpriteBatch batch){
/*
      if(Gdx.input.isKeyPressed(Input.Keys.I)){
          blade.setY(blade.getY() + speed.y);
      }

      if(Gdx.input.isKeyPressed(Input.Keys.K)){
          blade.setY(blade.getY() - speed.y);
      }

      if(Gdx.input.isKeyPressed(Input.Keys.L)){
          blade.setX(blade.getX() + speed.x);
      }

      if(Gdx.input.isKeyPressed(Input.Keys.J)){
          blade.setX(blade.getX() - speed.x);
      }
*/
        batch.draw(img, blade.getX(), blade.getY(), blade.getWidth(), blade.getHeight());
    }
}

