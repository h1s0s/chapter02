package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요");
		num = sc.nextInt();
		try {//예외가 발생하는 영역
			result = 100/num;//입력한 숫자가 0이면 에러남, 여기서 에러남
			System.out.println(result);
		} catch(ArithmeticException e) {//에러를 잡아내는 부분, 정해져 있는 자료형임 e는 개발자가 쓰는 이름
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println(e.toString());
		} finally {//예외발생 여부와 상관없이 무조건 실행되는 영역
			System.out.println("Finally 영역");//이부분은 생략 가능.
		}
		
		
		sc.close();
	}

}
