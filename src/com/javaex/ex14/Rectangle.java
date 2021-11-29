package com.javaex.ex14;

public class Rectangle extends Shape {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();//부모클래스의 디폴트 생성자
	}
	
	/*부모클래스와 결합된 생성자*/
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		//super.lineColor = lineColor; 에러가 나는 이유는, private로 보호되고 있기 때문
		super(lineColor, fillColor);//부모클래스의 생성자를 가져옴
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
		return "Rectangle [lineColor=" + getLineColor() + ", fillColor=" + getFillColor() + ", width = "+ width +",height=" + height + "]";
	//toString을 재정의하여 부모의 필드까지 표현되도록 코드를 짰음.
	//필드가 캡슐화 되어있기 때문에 부모클래스의 get메소드를 사용함
	}
	
	public void draw() {
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 가로:"+this.width+" 세로:"+height+" 사각형을 그렸습니다.");
		//부모클래스의 필드를 protected로 바꾸어 가져다 사용 가능
		
	}
	
}
