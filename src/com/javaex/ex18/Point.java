package com.javaex.ex18;

public class Point implements Drawable {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	//메소드 g/s
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void SetX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw() {//인터페이스의 메소드 구현, 안하면 에러남.
		System.out.println("x="+x+" y="+y+" 점을 그렸습니다.");
	}

}
