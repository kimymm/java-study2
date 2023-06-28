package com.bitacademy.paint.text;

import com.bitacademy.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("'" + text + "'Hello World 를 그렸습니다. ");
	}

}
