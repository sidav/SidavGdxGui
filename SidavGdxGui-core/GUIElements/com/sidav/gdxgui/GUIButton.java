package com.sidav.gdxgui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GUIButton extends GUIAbstract {

	int width, height;
	public GUIButton(int x, int y, int w, int h) 
	{
		super(x,y);
		width = w;
		height = h;
		// TODO Auto-generated constructor stub
	}
	
	public void Draw(Pixmap pxmp, SpriteBatch btch)
	{
        pxmp.setColor(Color.BLACK);
		pxmp.fillRectangle(xCoord, yCoord, width, height);
		Texture t = new Texture(pxmp);
		t.draw(pxmp, 0, 0);
		btch.draw(t, 0, 0);
//		Sprite s = new Sprite(t);
//		s.draw(btch);
	}

}
