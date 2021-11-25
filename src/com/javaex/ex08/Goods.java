package com.javaex.ex08;

public class Goods {

	// 필드
	String name;
	int price;
	private static int count;//static을 붙이면 공통변수로 사용가능

	// 생성자
	public Goods() {
		this.count++;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.count++;
	}

	// 메소드 g-s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count="+ count + "]";
	}

	public void showinfo() {
		System.out.println("상품이름: " + name);
		System.out.println("상품가격: " + price);
	}

}
