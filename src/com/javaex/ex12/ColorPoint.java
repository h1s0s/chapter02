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
		super(x, y);//부모 생성자(x,y)인거 가져오기
		this.color = color;
	}
	//메소드 일반
	public void showInfo() {
		System.out.println("x:"+super.x);
		System.out.println("y:"+super.y);
		System.out.println("color:"+this.color);
	}
}
