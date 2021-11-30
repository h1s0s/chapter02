package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		Student s01 = new Student("이정재", 46, "강남고등학교");
		s01.showInfo();
		
		//섞어쓰기(부모클래스와 자식클래스를 씀)
		Person ps01 = new Student("강호동", 50, "마산고등학교"); 
		ps01.showInfo();
		System.out.println(ps01.toString());
		
		/*
		섞어쓰기 특징
		1. 자식의 showInfo(), toString 사용 가능.
		==> 이름이 겹치는 애들은 사용 가능, 이름이 안겹치는 애들은 못씀.
		2. 그외의 자식의 메소드는 사용 불가.
		
		메모리에 올라가는 형태는
		1. Person(부모), Student(자식)을 메모리에 올림, 하지만 Student타입은 올려졌지만 가린다, 자식클래스의 메소드를 직접 사용할 수 없다.(이런식으로 생각하는게 이해하기 편함)
		2. 이름이 겹쳐지는 메소드는 자식메소드가 부모메소드를 덮음(오버라이드) Tip 오버로딩이랑 헷갈릴 수 있음.
		3. 겹쳐지는 메소드를 사용하면 자식의 메소드가 적용됨.
		
		궁금
		1. extend로 묶여있지 않으면 섞어쓸수 없는것인지
		2. 반대로 Student sp01 = new Person();을 사용할 수 있는지?
		*/
		
		
		
	}

}
