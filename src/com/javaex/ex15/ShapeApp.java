package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		//부모,자식 섞어쓰기 응용
		
		//도형클래스의 자식들을 관리할 배열을 만든다
		Shape[] sArray = new Shape[3];
		
		//부모자료형의 배열에 자식클래스들 섞어넣기
		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		sArray[0] = r01;
		Shape c01 = new Circle("노랑", "노랑", 100);
		sArray[1] = c01;
		Shape t01 = new Triangle("파랑", "파랑", 20, 20);
		sArray[2] = t01;

		//r01.draw(); //메소드 오버라이딩이 되어 자식클래스의 draw()메소드가 부모의 draw()에 덮어짐, 부모클래스에 draw()가 없으면 작동 안함.
		//c01.draw();
		//t01.draw();
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		//부모 자식을 섞어쓰면, 부모클래스의 배열을 만들고 나열이 가능하다.
		
		System.out.println(((Circle)c01).getRadius()); // Shape자료형의 c01을 Circle자료형의 c01로 강제 형변환한후, Radius를 가져옴, 이를 다운캐스팅이라고 함.
		
	}

}
