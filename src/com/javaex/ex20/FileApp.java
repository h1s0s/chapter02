package com.javaex.ex20;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {
		
		FileManager fr = new FileManager();

		//발생하는 곳이 아닌, 오류가 나는 메소드를 처리하는 곳에서 예외처리를 하는 경우.
		try {
			fr.readfile();
		} catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}

}
