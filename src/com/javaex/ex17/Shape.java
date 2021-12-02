package com.javaex.ex17;

public abstract class Shape {

	//필드
	protected String lineColor;
	protected String fillColor;

	//생성자
	public Shape() {
	}
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	//메소드 g-s
	public String getLineColor() {
		return lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	public abstract double area();
	//추상 메소드
	//abstract라 적고, 클래스 명 앞에도 적어야함.
}
