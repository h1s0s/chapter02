package com.javaex.ex03;

public class Song {

	// 필드
	private String title;//
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 메소드
	//alt+shift+s -> generatie getter and setter
	//게터 세터 자동생성
	//ctrl + shift + f
	//자동 정렬
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String getTrack() {
		return title;
	}

	public void showInfo() {
		System.out.println(
				artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
