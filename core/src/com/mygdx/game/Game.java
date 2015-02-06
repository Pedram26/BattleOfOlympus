package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;


public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Rectangle rect;
	Vector2 speed;
	Sprite sprite;
	boolean fullscreen;
	boolean changeOfSpeed;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("GodOfWar.jpg");
		fullscreen = false;
		//Gdx.graphics.setDisplayMode(1280, 720, fullscreen);
		rect = new Rectangle(100, 100, 150, 200);
		speed = new Vector2(10, 10);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
			if(speed.x == 10 && !changeOfSpeed){
				speed.x *= 9;
				speed.y *= 9;
				changeOfSpeed = true;
			}else if (speed.x != 10 && changeOfSpeed){
				speed.x = 10;
				speed.y = 10;
				changeOfSpeed = false;
			}
		}

		if (rect.getY() + rect.getHeight() < Gdx.graphics.getHeight()) {
			if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
				rect.setY(rect.getY() + speed.y);
				//speed.y++;
			}
		}

		if (rect.getY() > 0) {
			if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
				rect.setY(rect.getY() - speed.y);
				//speed.y--;
			}
		}

		if (rect.getX() + rect.getWidth() < Gdx.graphics.getWidth()){
			if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
				rect.setX(rect.getX() + speed.x);
				//speed.x++;
			}
		}

		if(rect.getX() > 0) {
			if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
				rect.setX(rect.getX() - speed.x);
				//speed.x--;
			}
		}

		batch.begin();
		batch.draw(img, rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		batch.end();
	}
}