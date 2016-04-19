package com.sidav.gdxgui;

import java.util.ArrayList;
//import java.util.List;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GUIScreen {

	ArrayList<GUIAbstract> AllGui = new ArrayList<GUIAbstract>();
	
	public GUIScreen() 
	{ }//holder for all GUI shit
	
	
	public void AddElement(GUIAbstract gbt)
	{
		AllGui.add(gbt);
	}
	
	public void DrawEverything(SpriteBatch btch)
	{
		Pixmap pxmp = new Pixmap(480, 320, Pixmap.Format.RGBA8888);
		pxmp.setColor(Color.RED);
        pxmp.fill();
		for (int i = 0; i < AllGui.size(); i++)
			AllGui.get(i).Draw(pxmp, btch);
//		pixmap.
	}

}
