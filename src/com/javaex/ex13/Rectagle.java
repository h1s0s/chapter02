package com.javaex.ex13;

public class Rectagle {

	//필드
	private String lineColor;//선색
	private String fillColor;//면색
	private int width;//가로
	private int height;//세로

	//생성자
	public Rectagle() {
		
	}
	public Rectagle(String lineColor, String fillColor, int width, int height) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.width = width;
		this.height = height;
	}

	//메소드 g-s
	public String getLineColor() {
		return lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
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
		return "Rectagle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}
	public void draw() {
		System.out.println("선색:"+lineColor+" 면색:"+fillColor+" 가로:"+width+" 세로:"+height+" 사각형을 그렸습니다.");
	}
}
