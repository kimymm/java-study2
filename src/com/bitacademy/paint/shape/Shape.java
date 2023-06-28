package com.bitacademy.paint.shape;

import com.bitacademy.paint.i.Drawable;

public abstract class Shape implements Drawable{// 주의!
	private String lineColor;
	private String fillColor;
//	public abstract void draw(); //구현이 되지 않: abstract키워드 사용, Drawble
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
}
