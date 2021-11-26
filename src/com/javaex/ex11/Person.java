package com.javaex.ex11;

public class Person {

	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("person");
	}
	//메소드 get-set
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//메소드 일반
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	public void showInfo() {
		System.out.println("==============");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("==============");
		System.out.println("");
	}
}
