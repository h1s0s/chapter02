package com.javaex.ex01;

public class Goods {

	//필드
	//private를 붙이면 인스턴트화 할때
	//초기화를 막을 수 있음.
	//이 방법은 위험하기 때문에 이렇게 하는것임
	//이유는 모름
	private String name;//이름을 받을 변수
	private int price;//가격을 받을 변수
	
	//생성자
	
	//메소드
	//1접근지정자 2리턴타입 3메소드이름(4메소드인자);
	public void setName(String n) {
		name = n;
	}
	public String getName() {//리턴을 담당할 메소드
		return name;
	}
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
	}
}
