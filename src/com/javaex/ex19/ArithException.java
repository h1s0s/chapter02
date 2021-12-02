package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();//입력한 숫자가 0이면 에러남
		
		result = 100/num;
		
		System.out.println(result);
		
		sc.close();
	}

}
