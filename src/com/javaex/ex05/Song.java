package com.javaex.ex05;

public class Song {
	
	//필드
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	//생성자
	public Song() {
		System.out.println("Song0()");
		
	}
	public Song(String title, String artist, String album, String composer) {
		this(title, artist, album, composer, 0);
		System.out.println("Song(4)");
	}
	public Song(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		//작곡가 이름 최대 10글자 까지 입력(조건)
		this.composer = composer;
		
		//년도 2021년 이후 연도가 들어오면 2021로 처리
		this.year = year;
		System.out.println("Song(5)");
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist, album, composer, year);
		//다른 생성자(song(5))를 부르는 코드
		this.track = track;
		System.out.println("Song(6)");
	}

	//메소드 g-s
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	//메소드 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )");
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	
}
