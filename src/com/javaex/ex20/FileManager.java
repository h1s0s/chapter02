package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	
	//필드
	
	//생성자

	//메소드 g-s
	
	//메소드 일반
	public void readfile() throws IOException {
		/*
		 try {
			System.out.println("파일을 읽었습니다.");
			throw new IOException(); // 파일을 못 읽었을때(인풋 에러)
		} catch(Exception e) {
			System.out.println("파일이 없습니다.");
		} 
		*/
		System.out.println("강제예외상황발생");
		throw new IOException();
		
	}
}
