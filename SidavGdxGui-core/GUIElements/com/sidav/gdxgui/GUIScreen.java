package com.sidav.gdxgui;

import java.util.ArrayList;
import java.util.List;

public class GUIScreen {

	public GUIScreen() { }//holder for all GUI shit
	List<GUIAbstract> AllGui = new ArrayList<GUIAbstract>();
	
	public void AddElement(GUIAbstract gbt)
	{
		AllGui.add(gbt);
	}
	
	public void DrawEverything()
	{
		
	}

}
