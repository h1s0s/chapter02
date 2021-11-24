package com.javaex.ex06;

public class Math {
	
	//필드
	//생략
	
	//생상자
	//디폴트 생상자 사용
	
	//메소드 - g/s
	//생략
	
	//메소드 - 일반
	public int plus(int num01, int num02) {
		int sum = num01+num02;
		return sum;
	}
	public double plus(double num01, double num02) {
		double sum = num01+num02;
		return sum;
	}
	public double plus(int num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}
	public double plus(double num01, int num02) {
		double sum = num01 + num02;
		return sum;
	}
}
