package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = new int[] {3,6,9};

		try {
			System.out.println(intArray[3]);	//없는 배열의 인덱스를 출력하려고 할때 에러가 남
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch(ArithmeticException e) {		//캐치를 여러번 사용 가능, 부모의 자료형으로도 잡을 수 있음. Exception이라는 부모를 가지고 있음.
			System.out.println(e.toString());
		}
		finally {
			
		}
	}

}
