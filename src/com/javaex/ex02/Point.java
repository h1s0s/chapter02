package com.javaex.ex02;

public class Point {
	//필드
	private int xcoo;
	private int ycoo;
	
	//메소드
	public void setX(int x) {
		xcoo = x;
	}
	public void setY(int y) {
		ycoo = y;
	}
	public int getX() {
		return xcoo;
	}
	public int getY() {
		return ycoo;
	}
	public void draw() {
		System.out.println("점[x="+xcoo+", y="+ycoo+"]을 그렸습니다.");
	}
}
