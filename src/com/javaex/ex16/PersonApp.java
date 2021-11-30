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
		 * 
		섞어쓰기 특징
		1. 자식의 showInfo(), toString 사용 가능.
		==> 이름이 겹치는 애들은 사용 가능, 이름이 안겹치는 애들은 못씀. 이것을 메소드 오버라이딩이라고 함
		2. 그외의 자식의 메소드는 사용 불가.
		
		메모리에 올라가는 형태는
		1. Person(부모), Student(자식)을 메모리에 올림, 하지만 Student타입은 올려졌지만 가린다, 자식클래스의 메소드를 직접 사용할 수 없다.(이런식으로 생각하는게 이해하기 편함)
		2. 이름이 겹쳐지는 메소드는 자식메소드가 부모메소드를 덮음(오버라이딩) Tip 오버로딩이랑 헷갈릴 수 있음.
		3. 겹쳐지는 메소드를 사용하면 자식의 메소드가 적용됨.
		
		궁금
		1. extend로 묶여있지 않으면 섞어쓸수 없는것인지
		2. 반대로 Student sp01 = new Person();을 사용할 수 있는지?
		
		배열에 담을때 타입을 맞추는게 낫다.
		3. 배열을 같은 타입으로 바꾸는 이유(섞어써서)? 한꺼번에 처리를 하기 위해.= 섞어쓰지않으면 형변환되어서 Shape만 출력됨.
		ex) Shape[]에 자식클래스들을 넣으면 Shape로 형변환 되서 들어감. 그럼 문제가생김 그래서 섞어쓰기를 사용해 넣으면 shape 타입으로 들어가기 떄문에 이 문제 해결 가능.
		4. 부모클래스에서 자식클래스의 필드를 가져다 쓸수 있는 개념이 헷갈림
		
		업캐스팅, 다운캐스팅
		
		나중에 자식 클래스를 다시 꺼내서 가져다 쓸 수 있음.
				 
		*/
		
		
		
	}

}
