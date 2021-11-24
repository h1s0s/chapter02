package com.javaex.ex02;

public class Point {
	//필드
	//private : 같은 클래스가 아닌 곳에서 데이터에 접근을 막아줌
	//이를 캡슐화라고 함 일반적으로 이렇게 캡슐화를 해놓는 편임
	private int x;
	private int y;
	
	//생성자
	//
	//생성자는 해당 클래스에 메모리를 올리는 일을 함
	//또 set,get의 역할을 추가적으로 할 수도 있음
	//
	//기본적으로는 만들어 주지 않더라도 잘 돌아감
	//이유는 눈에 보이지 않는 형태로 이미 생성 되어(디폴트,기본 생성자) 있기 때문에
	//
	//사용자가 따로 코드를 작성해 줄 경우에 기존에 디폴트 생성자는 사라짐
	//디폴트 생성자를 따로 기입해 주어야 함.(나중에 값을 수정할수 없기때문에)
	//리턴타입 적을필요 없고, 이름은 클래스 이름
	//
	//생성자는 여러개 만들어 놔도 생성할때는 한가지만 쓰임
	public Point() {//디폴트 생성자
		System.out.println("Point(0)");
	}
	public Point(int x) {//1가지 값을 받을 생성자
		this.x = x;
		System.out.println("Point(1)");
	}
	
	
	public Point(int x, int y) {//2가지 값을 받을 생성자
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}
	
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
	//action-true 그리는 기능, action-false 지우는 기능
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		} else if(action == false) {
			System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
		} else {
			System.out.println("잘못된 입력");
		}
	}
}
