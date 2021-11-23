package com.javaex.ex05;

public class SongApp {
	
	//필드
	
	//생성자
	
	//메소드 g-s
	
	//메소드 일반
	public static void main(String[] args) {
		Song iu = new Song("좋은날", "아이유", "Real", "이민수", 2007, 3);
		iu.showInfo();
		
		Song bigbang = new Song();
		bigbang.setTitle("거짓말");
		bigbang.setArtist("BIGBANG");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");
		bigbang.showInfo();
		
		Song busker = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		busker.showInfo();
	}

}
