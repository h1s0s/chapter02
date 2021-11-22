package com.javaex.ex03;

public class Song {

	//필드
	private String title;//
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	//메소드
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	public void setArtist(String a) {
		artist = a;
	}
	public String getArtist() {
		return artist;
	}
	public void setAlbum(String ab) {
		album = ab;
	}
	public String getAlbum() {
		return album;
	}
	public void setComposer(String c) {
		composer = c;
	}
	public String getComposer() {
		return composer;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	public void setTrack(int t) {
		track = t;
	}
	public String getTrack() {
		return title;
	}
	public void showInfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )");
	}
}
