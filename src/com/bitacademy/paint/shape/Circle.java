package com.bitacademy.paint.shape;

public class Circle extends Shape {
	private int x, y;
	private float radius;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	System.out.println("원을 그렸습니다.");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

}
