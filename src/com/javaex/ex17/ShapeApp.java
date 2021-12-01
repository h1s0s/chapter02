package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Rectangle r01 = new Rectangle("빨강", "빨강", 5, 10);
		System.out.println(r01.area());
		
		Circle c01 = new Circle("파랑", "파랑", 5);
		System.out.println(c01.area());
		
		Triangle t01 = new Triangle("노랑", "노랑", 5, 10);
		System.out.println(t01.area());
		*/
		
		Shape[] sArray = new Shape[3];
		Shape r01 = new Rectangle("빨강", "빨강", 5, 10);
		sArray[0]=r01;
		Shape c01 = new Circle("파랑", "파랑", 5);
		sArray[1]=c01;
		Shape t01 = new Triangle("노랑", "노랑", 5, 10);
		sArray[2]=t01;
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		//Shape자료형의 배열에 자식자료형의 객체를 넣으면
		//잘 들어가고 메소드도 원하는 대로 출력됨.
		//이경우는 자식자료형의 객체가 Shape로 형변환 된거 같은데
		//이것도 섞어쓰기랑 같은 개념인지 궁금
	}

}
