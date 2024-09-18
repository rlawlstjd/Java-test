package com.test.java.ch17;

import java.util.List;
import java.util.ArrayList;


public class Ex04Generics {
	public static void main(String[] args) {
		BoardDefaultService service = null;
		
		Board b1 = new Board();
		b1.setTitle("안녕하세요");
		b1.setContent("글 내용입니다.");
		
		Board b2 = new Board();
		b2.setTitle("안녕하세요");
		b2.setContent("글 내용입니다.");
		
		List<Board> bList = new ArrayList<Board>();
		bList.add(b1);
		bList.add(b2);
		
		service = new BoardService();
		// service.printList1(bList);	// error
		service.printList2(bList);
		service.printList3(bList);
		
		System.out.println();
		
		Photo p1 = new Photo();
		p1.setTitle("사진1 제목");
		p1.setContent("사진1 내용");
		p1.setPhoto("a.jpg");
		
		Photo p2 = new Photo();
		p2.setTitle("사진2 제목");
		p2.setContent("사진2 내용");
		p2.setPhoto("b.jpg");
		
		List<Photo> pList = new ArrayList<Photo>();
		pList.add(p1);
		pList.add(p2);
		
		service = new PhotoService();
		// bs.printList1(bList);	// error
		service.printList2(pList);
		service.printList3(pList);
	
		
		Diary diary = new Diary();
		diary.setTitle("다이어리 제목");
		diary.setContent("다이어리 내용");
		diary.setPhoto("다이어리 사진");
		diary.setVideo("다이어리 동영상");
		
		Diary diary1 = new Diary();
		diary1.setTitle("다이어리 제목");
		diary1.setContent("다이어리 내용");
		diary1.setPhoto("다이어리 사진");
		diary1.setVideo("다이어리 동영상");
		
		List<Diary> dList = new ArrayList<>(); 
		dList.add(diary);
		dList.add(diary1);
		
		service = new DiaryService();
		service.printList2(dList);
		service.printList3(dList);
	}
}

interface BoardDefaultService {
	
	public default void printList1(List<Object> boardList) {	// only List<Object>
		System.out.println("printList1");
		for (Object obj : boardList) {
			System.out.println(obj.toString());
		}
		System.out.println();
	}
	
	public default void printList2(List<?> boardList) {
		System.out.println("printList2");
		for (Object obj : boardList) {
			System.out.println(obj.toString());
			// System.out.println(obj.getTitle());		// error
		}
		System.out.println();
	}
	
	public abstract void printList3(List<?> boardList);
}

class BoardService implements BoardDefaultService {
	
	@Override
	public void printList3(List<?> boardList) {
		System.out.println("printList3");
		for (Object obj : boardList) {
			if (!(obj instanceof Board)) return;
			
			Board board = (Board)obj;
			
			System.out.println(board.getTitle());
			System.out.println(board.getContent());
			System.out.println("-----");
		}
		System.out.println();
	}
}

class PhotoService implements BoardDefaultService {
	
	@Override
	public void printList3(List<?> photoList) {
		System.out.println("printList3");
		for (Object obj : photoList) {
			if (!(obj instanceof Photo)) return;
			
			Photo photo = (Photo)obj;
			
			System.out.println(photo.getTitle());
			System.out.println(photo.getContent());
			System.out.println(photo.getPhoto());
			System.out.println("-----");
		}
		System.out.println();
	}
}

class DiaryService implements BoardDefaultService{
	
	@Override 
	public void printList3(List<?> DiaryList) {
		System.out.println("diaryList3");
		for ( Object obj : DiaryList ) {
			if(! (obj instanceof Diary)) return;
			
				
				Diary diary = (Diary)obj;
				
			System.out.println(diary.getTitle());
			System.out.println(diary.getPhoto());
			System.out.println(diary.getVideo());
			System.out.println(diary.getContent());
			System.out.println("----"); 
		} 
		System.out.println();
	}
}

class Board {
	private String title;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + "]";
	}
}

class Photo extends Board {
	private String photo;

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Photo [title=" + getTitle() + ", content=" + getContent() + "photo=" + photo + "]";
	}
}

class Diary extends Photo {
	private String video ; 
	
	public void setVideo (String video) {
		this.video = video ; 
	}
	
	public String getVideo() {
		return video ; 
	}
	@Override 
	public String toString () {
		return "Diary [title=" + getTitle() + ", content=" + getContent() + "photo=" +
				getPhoto() + ", video=" + video + "]";
	}
}

/*
문제 1.
다이어리 클래스와 다이어리 서비스 클래스를 추가하세요. 
다이어리 서비스를 사용해 printList2 와 printList3를 호출하는 코드를 작성하세요.
*/ 