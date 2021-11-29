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
		
		//배열을 생성해 수납
		Rectagle[] rArray = new Rectagle[3];
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 draw하기 (배열,반복문응용)
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		//모든 사각형의 선색만 출력
		//필드에 직접 접근할 수 없기때문에
		//get메소드 이용
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
		///////////////////////////////////////////////////////////////////////
	
		//원을 관리할 배열
		Circle[] cArray = new Circle[3];
		
		//원을 3개 만듬
		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("검정", "노랑", 5);
		Circle c03 = new Circle("파랑", "초록", 7);
		
		//원을 배열에 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		//////////////////////////////////////////////////
		
		//삼각형을 관리할 배열
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("색깔", "색깔", 1, 1);
		Triangle t02 = new Triangle("색깔", "색깔", 1, 1);
		Triangle t03 = new Triangle("색깔", "색깔", 1, 1);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	}

}
