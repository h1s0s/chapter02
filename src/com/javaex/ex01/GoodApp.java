package com.javaex.ex01;

public class GoodApp {

	public static void main(String[] args) {

		//setName방법:필드가 아닌 메소드에 값을 넣어줌.
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);

		//개별 출력 방법
		//1의 방법 : get메소드를 이용한 출력
//		System.out.println(camera.getName());
//		System.out.println(camera.getPrice());
		//2의 방법 : 변수에 대입해 출력
//		String cameraName = camera.getName();
//		System.out.println(cameraName);
		//메소드 출력 방법 : 메소드를 이용해 출력
		camera.showInfo();
		System.out.println("");
		computer.showInfo();
		System.out.println("");
		cup.showInfo();
		
		//Goods 자료형(사용자가 만듬)에 camera라는 이름의 변수를 메모리에 올림
//		camera.name = "니콘";
		//Goods 클래스 필드에 네임 값을 대입함
//		camera.price = 400000;
		//Goods 클래스 필드에 프라이스 값을 대입함
		
//		Goods computer = new Goods();
//		computer.name = "LG그램";
//		computer.price = 900000;
//		
//		Goods cup = new Goods();
//		cup.name = "머그컵";
//		cup.price = 4000;
//		
//		System.out.println(camera.name);
//		System.out.println(camera.price);
//		
//		System.out.println(computer.name);
//		System.out.println(computer.price);
	}

}
