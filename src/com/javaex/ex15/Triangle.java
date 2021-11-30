package com.javaex.ex15;

public class Triangle extends Shape {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		
	}
	
	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	//메소드 g-s
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Triangle [lineColor=" + getLineColor() + ", fillColor=" + getFillColor() + ", width = "+ width +",height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 가로:"+this.width+" 세로:"+height+" 사각형을 그렸습니다.");
	}
	
}

