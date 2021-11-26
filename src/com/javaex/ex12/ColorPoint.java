package com.javaex.ex12;

public class ColorPoint extends Point{
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		
	}
	public ColorPoint(String color) {
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super.setX(x);
		super.setY(y);
		this.color = color;
	}
	//메소드 일반
	public void showInfo() {
		System.out.println("x:"+getX());
		System.out.println("y:"+getY());
		System.out.println("color:"+this.color);
	}
}
