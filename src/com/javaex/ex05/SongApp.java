package com.javaex.ex05;

public class SongApp {
	
	//필드
	
	//생성자
	
	//메소드 g-s
	
	//메소드 일반
	public static void main(String[] args) {
		Song s01 = new Song("좋은날", "아이유", "Real", "이민수", 2007, 3);
		s01.showInfo();
		
		//디폴트 생성자를 이용한 메모리 생성법
		Song s02 = new Song();
		s02.setTitle("거짓말");
		s02.setArtist("BIGBANG");
		s02.setAlbum("Always");
		s02.setYear(2007);
		s02.setTrack(2);
		s02.setComposer("G-DRAGON");
		s02.showInfo();
		
		Song s03 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		s03.showInfo();
		
		Song s04 = new Song("벚꽃엔딩2","버스커버스커2","버스커버스커1집2","장범준2");
		System.out.println(s04.toString());
	
		Song s05 = new Song("벚꽃엔딩3","버스커버스커3","버스커버스커1집3","장범준3", 2007, 3);
		
	}

}
