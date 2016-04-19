package com.sidav.gdxgui;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GUIAbstract {

	protected int xCoord, yCoord;
	public GUIAbstract(int x, int y) 
	{
		xCoord = x;
		yCoord = y;		
	}
	
	public abstract void Draw(Pixmap pxmp, SpriteBatch btch);

}
