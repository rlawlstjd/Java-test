package com.test.java.ch17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex03SubType {
	public static void main(String[] args) {
		List<Music> musicList = new ArrayList<Music>();
		musicList.add(new Music("노래1"));
		musicList.add(new Music("노래2"));

		Player.play(musicList);
				
		Player.addRecommendedContent(musicList);
		Player.play(musicList);
		
		List<Content> contents = new ArrayList<Content>();
		contents.add(new Music("노래3"));
		contents.add(new Music("노래4"));
		
		Player.play(contents);
		
		Player.addRecommendedContent(contents);
		Player.play(contents);
		
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("영화1"));
		movieList.add(new Movie("영화2"));
		
		Player.play(movieList);
		
		
		
		Player.<Music>play(new Music("음악1"));
		Player.play(new Movie("무비1"));
	
		Player.playReversed(movieList);
		System.out.println();
		
		Player.playReversed(musicList);
		System.out.println();
		
		Player.remove(movieList);
		Player.play(movieList);
		System.out.println(); 
		
		Player.remove(musicList);
		Player.play(musicList);
		
	}

}


class Player {
	
	public static void remove(List<? extends Content> playList) {
		if(!playList.isEmpty()) {
			int lastIndex = playList.size() - 1 ; 
			playList.remove(lastIndex);	
		} else {
			System.out.println("리스트가 비어있습니다."); 
		}
	}
	
	public static void playReversed(List<? extends Content> playList) {
		Collections.reverse(playList);
		for (Content c : playList ) {
			System.out.println(c.getTitle()); 
		}
		
	}
	
	public static void play(List<? extends Content> playList) {
		for (Content c : playList) {
			System.out.println("재생: " + c.getTitle());
		}
		System.out.println();
		
	
	}
	
	public static void addRecommendedContent(List<? super Music> playList) {
		Music music = new Music("인공지능추천음악1");
		playList.add(music);
		
		
	}
	
	public static <T extends Content> void play(T content) {
		System.out.println(content.getTitle());
		System.out.println();
	}
}

interface Content {
	public abstract String getTitle();
}

class Movie implements Content {
	private String title;
	private String writer;
	private String director;
	
	public Movie(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}

class Music implements Content {
	private String songTitle;
	private String songWriter;
	private String lyricist;
	
	public Music(String songTitle) {
		this.songTitle = songTitle;
	}

	@Override
	public String getTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getSongWriter() {
		return songWriter;
	}
	public void setSongWriter(String songWriter) {
		this.songWriter = songWriter;
	}

	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
}