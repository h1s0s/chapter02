package com.javaex.ex19;

public class NullPointerException {

	public static void main(String[] args) {

		String str = new String("hello");//String은 참조 자료형이므로 str에 들어있는 값은 주소임.
		
		try {
			str = null;
			System.out.println(str.toString());//null의 주소값을 출력하라고 하니 에러가 남
		} catch(Exception e) {
			System.out.println("에러발생");
		}
		
	}

}
