package com.javaex.ex11;

public class PersonApp {

	//필드
	
	//생성자
	
	//메소드 g-s
	
	//메소드 일반
	public static void main(String[] args) {
		//1. person(부모클래스)
		//Person p01 = new Person("정우성", 45);
		
		//Person p02 = new Person();
		//p02.setName("이정재");
		//p02.setAge(46);
		
//		System.out.println(p01.toString());
//		System.out.println(p02.toString());
	
		//p01.showInfo();
		//p02.showInfo();
		
		//2. Student(자식클래스)
		//부모클래스를 상속받는 자식클래스를 만들어 보자
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("서울고등학교");
		
		s01.showInfo();
		
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
		
		//자식클래스에 생성자를 만들어 상속받은 필드까지 표기 
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		System.out.println(s02.getName());
		System.out.println(s02.getAge());
		System.out.println(s02.getSchoolName());
		
	}
}
