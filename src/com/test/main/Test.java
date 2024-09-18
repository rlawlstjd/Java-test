package com.test.main;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Music> musicList = new ArrayList<>(); 
		musicList.add(new Music ("숨", "박효신"));
		musicList.add(new Music ("어디에도", "이수"));
		musicList.add(new Music ("보고싶다", "김범수")); 
		
		Player.play(musicList);
		Player.recommendedSong(musicList);
		Player.play(musicList);
		System.out.println("\n\n\n");
		
		
		List<Movie> movieList = new ArrayList<Movie> ();
		movieList.add(new Movie("미나리", "봉준호"));
		movieList.add(new Movie("설국열차", "봉준호")); 
		movieList.add(new Movie("자바", "엘컴퓨터")); 
		
		Player.play(movieList);
		
		Player.play(new Movie("나", "엘컴퓨터학원"));
		Player.<Music>play(new Music("나를", "전상근")); 
		System.out.println(); 
		
		
	}
}
interface Content {
	public abstract String getTitle();
	public abstract String getHuman(); 
}
class vu {
	
}

class Player {
	public static void play (List <? extends Content> playList ) {
		for (Content c : playList) {
			System.out.println(c.getTitle()+ " , " +c.getHuman());
		}
	}
	
	public static void recommendedSong (List<? super Music> playList) {
		Music music = new Music("정류장", "장범준");
		playList.add(music);
	}
	
	public static <T extends Content> void play (T contents) {
		System.out.println(contents.getTitle());
		
	}
}


class Music implements Content{
	String songTitle; 
	String songWriter; 
	String human;
	
	Music(String songTitle, String songWriter){
		this.songTitle = songTitle;
		this.human = songWriter;
	}
	
	@Override
	public String getHuman() {
		return human;
	}
	
	@Override
	public String getTitle() {
		return songTitle; 
	}
	
	public String getSongWriter() {
		return songWriter;
	}
}

class Movie implements Content{
	String movieTitle; 
	String author;
	String human; 
	
	Movie (String movieTitle, String author){
		this.movieTitle= movieTitle; 
		this.human = author;
	}
	
	@Override
	public String getHuman() {
		return human; 
	}
	
	
	@Override
	public String getTitle () {
		return movieTitle;
	}
	
	
}

