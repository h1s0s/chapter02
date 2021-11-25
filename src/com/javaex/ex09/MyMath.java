package com.javaex.ex09;

public class MyMath {

	//필드 -- 필요 X
	
	//생성자 -- 디폴트 생성자
	
	//메소드 g/s -- 필드X
	
	//메소드 일반
	//메소드 이름이 같아도 파라미터가 다르면 겹치지 않는다.
	//메소드 오버로딩
	public int plus(int a, int b) {
		return a+b;
	}
	
	public double plus(double a, double b) {
		return a+b;
	}

	public double plus(double a, int b) {
		return a+b;
	}
	public double plus(int a, double b) {
		return a+b;
	}
}
