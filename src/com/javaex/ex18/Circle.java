package com.javaex.ex18;

public class Circle extends Shape implements Drawable{

	//필드
	protected int radius;
	
	//생성자
	public Circle() {
		
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	//메소드 g-s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Circle [lineColor="+getLineColor()+", fillColor"+getFillColor()+", radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 반지름:"+radius+" 원을 그렸습니다.");
	}
	
	public double area() {
		double result = radius * radius * 3.14;
		return result;
	}
}
