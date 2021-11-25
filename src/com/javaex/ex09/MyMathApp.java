package com.javaex.ex09;

public class MyMathApp {

	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public static void main(String[] args) {
//		MyMath math = new MyMath();
		
//		System.out.println(math.plus(1,2));
		System.out.println(MyMath.plus(1, 2));//스태틱으로 올라와있는 MyMath 클래스의 plus 메소드를 불러옴.
		System.out.println(MyMath.plus(4.3, 5.5));
		System.out.println(MyMath.circleArea(5));
		System.out.println(MyMath.circleRound(5));
	}

}
