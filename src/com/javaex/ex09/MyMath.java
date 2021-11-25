package com.javaex.ex09;

public class MyMath {

	//필드 -- 필요 X
	private static double PI = 3.14159;
	//생성자 -- 디폴트 생성자
	
	//메소드 g/s -- 필드X
	
	//메소드 일반
	//메소드 이름이 같아도 파라미터가 다르면 겹치지 않는다.
	//메소드 오버로딩
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}

	public static double plus(double a, int b) {
		return a+b;
	}
	public static double plus(int a, double b) {
		return a+b;
	}
	public static double circleArea(int radius) {//원의 넓이
		return radius * radius * PI;
	}
	public static double circleRound(int radius) {//원의 지름
		return (radius+radius)* PI;
	}
	
}
