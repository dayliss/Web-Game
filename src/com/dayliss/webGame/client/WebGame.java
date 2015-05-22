package com.dayliss.webGame.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2D;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class WebGame implements EntryPoint {

	private Canvas canvas;
	public Context2D context;
	
	public static final int width;
	public static final int height;
	
	
	public void onModuleLoad(){
		canvas = Canvas.createIfSupported();
		if (canvas == null) {
			RootPanel.get(holderId).add(new Label("Your browser does not support the HTML5 Canvas"));
			return;
		}
		canvas.setWidth(width+"px");
		canvas.setHeight(height+"px");
	    canvas.setCoordinateSpaceWidth(width);
		canvas.setCoordinateSpaceHeight(height);
		RootPanel.get("gameCanvas").add(canvas);
		context = Canvas.getContext2d();
	}

	void doUpdate(){
		context.clearRect(0,0,width,height);
		context.fillRect(10,10,10,10);
	}
}