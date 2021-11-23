package com.javaex.ex02;

public class Point {
	//필드
	private int x;
	private int y;
	
	//메소드
	//필드 변수와 메소드 변수의 이름 같으면 오류는 안나지만 원하는대로 안됨
	//그럴때 필드 변수 앞에 this.을 넣어서 오류를 방지할 수 있다
	//this.는 자기자신을 가리켜줌
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
}
