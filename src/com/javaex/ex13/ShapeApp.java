package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		//사각형 3가지 생성
		Rectagle r01 = new Rectagle("빨강", "노랑", 5, 5);
		Rectagle r02 = new Rectagle("파랑", "노랑", 10, 20);
		Rectagle r03 = new Rectagle("빨강", "빨강", 55, 77);
		
		//모두 draw하기
		/*r01.draw();
		r02.draw();
		r03.draw();*/
		
		Rectagle[] rArray = new Rectagle[3];
		
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 draw하기 반복문
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//모든 사각형의 선색만 출력
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
	}

}
