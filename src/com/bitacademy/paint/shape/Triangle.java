package com.bitacademy.paint.shape;

public class Triangle extends Shape{ //Rect을 그냥 cp하는게 얼마나 끝내, 와 빨리 끝났다
//	private String lineColor;
//	private String fillColor;
	private int x1, y1;
	private int x2, y2;
	private int x3, y3; //Rect에서 cp 하는게 얼마나 좋아
	
	@Override //아 시벌 안돼
	public void draw() { //없앨시 :The type Triangle must implement the inherited abstract method Shape.draw()
		System.out.println("삼각형을 그렸습니다.");
	}
	
//	public String getLineColor() {
//		return lineColor;
//	}
//
//	public void setLineColor(String lineColor) {
//		this.lineColor = lineColor;
//	}
//
//	public String getFillColor() {
//		return fillColor;
//	}
//
//	public void setFillColor(String fillColor) {
//		this.fillColor = fillColor;
//	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}
	//이러면 개털리기 시작하죠
}
