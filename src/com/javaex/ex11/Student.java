package com.javaex.ex11;

public class Student extends Person{//extends Person(부모클래스를 적어줍니다)
//Person클래스를 상속받을 클래스
	//필드
	//부모클래스에 있는 필드 외에
	//여기서 추가될 필드만 추가
	private String schoolName;
	
	//생성자
	public Student() {
		
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student(String name, int age, String schoolName) {
		/*
		 super.name = name;
		 super.age = age;
		 */
		//부모생성자 실행
		super(name, age);//괄호안에 파라미터
		
		//super.setName(name);
		//super.setAge(age);
		this.schoolName = schoolName;
		System.out.println("student");
	
	}

	//메소드 g-s
	//상속받은 클래스에 get-set를
	//만들지 않아도 사용할 수 있다.
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
}
