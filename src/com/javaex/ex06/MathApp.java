package com.javaex.ex06;

public class MathApp {

	public static void main(String[] args) {
		//메소드 오버로드
		Math math = new Math();
		System.out.println(math.plus(3, 2));
		System.out.println(math.plus(34.2, 27.4));
		System.out.println(math.plus(4, 5.6));
		System.out.println(math.plus(5.6, 5));
	}

}
