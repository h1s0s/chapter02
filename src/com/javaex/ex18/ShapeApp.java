package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Point p01 = new Point(5,5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(114,117);
		p02.draw();
		//System.out.println(p02.getX()); 안됨.
		System.out.println(((Point)p02).getX());//다운캐스팅하여 사용 가능
		*/
		Drawable[] dArray = new Drawable[4];
	
		Drawable r01 = new Rectangle("빨강", "빨강", 5, 7);
		Drawable c01 = new Circle("파랑", "파랑", 12);
		Drawable t01 = new Triangle("노랑", "노랑", 22, 55);
		Drawable p01 = new Point(2, 2);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//면적출력
		//강제로 형변환을 해도 없는 메소드를 출력하라 하면 오류남
		/*
		for(int i=0; i<dArray.length; i++) {
			System.out.println(((Shape)dArray[i]).area());
		}
		*/
		//Shape면 출력하고 Shape가 아니면 출력하지 마라.
		//instanceof라는 연산자를 사용해서 분류 가능
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {//인스턴스 Shape를 가지고 있느냐?
				System.out.println(((Shape)dArray[i]).area());
			}
		}
	}

}
