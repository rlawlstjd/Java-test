package RealTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LibraryService {
	public static void main(String[] args) {
		Library serv = new Library(); 
		
		serv.start();
		
	}
}


class Library {
	public static final String Id = "admin";
	public static final String Password = "000110";
	private List<Book> books ; 
	Scanner s = new Scanner(System.in); 
	
	public Library () {
		books = new ArrayList<>(); 
	}
	
	public void start() {
		System.out.println("환영합니다."); 
		System.out.println("경북 도서관에 오신것을 환영합니다."); 
		
		while(true) {
			System.out.println("실행할 항목을 입력해 주세요"); 
			System.out.println("1.책 목록 2.책 검색 3. 책 등록 4.관리자 모드 5.출력 9.종료");
			int select = Integer.parseInt(s.nextLine());
			boolean found = false; 
			
			switch (select) {
								case 1: 
									print(); 
									break; 
								case 2:
									System.out.println("검색할 책의 제목을 입력하세요"); 
									String searchTitle = s.nextLine(); 
									
									for (int i=0; i<books.size(); i++) {
										if (books.get(i) != null) {
											if (books.get(i).getTitle().trim().equals(searchTitle.trim())) {
												System.out.println("제목: " + books.get(i).getTitle() + ", 저자: " + books.get(i).getAuthor());
												found = true; 
												break; 
											} 
										}
									}
									if (!found) {
										System.out.println("존재하는 책이 없슶니다."); 
									}
									break; 
								case 3: 
									System.out.println("책의 제목을 입력하세요"); 
									String rTitle = s.nextLine(); 
									System.out.println("책의 저자를 입력하세요"); 
									String rAuthor = s.nextLine(); 
									add(new Book(rTitle, rAuthor)); 
									System.out.println("등록이 완료되었습니다."); 
									break; 
								case 4: 
									adminLogin(); 
									break; 
								case 5: 
									System.out.println("책 정보들이 저장되었습니다."); 
									save(); 
									break; 
								case 9:
									System.out.println("시스템이 종료됩니다."); 
									return; 
			}
		}
	}
	public void adminLogin() {
		System.out.println("아이디를 입력하세요"); 
		String id = s.nextLine(); 
		System.out.println("비밀번호를 입력하세요"); 
		String pw = s.nextLine(); 
		if (Id.equals(id) && Password.equals(pw)) {
			try {
				System.out.print("로그인 중"); 
				Thread.sleep(1000);
				System.out.print("."); 
				Thread.sleep(1000); 
				System.out.print("."); 
				Thread.sleep(1000); 
				System.out.print("."); 
				Thread.sleep(1000); 
				System.out.print("."); 
				Thread.sleep(1000); 
				System.out.println("."); 
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("관리자 모드를 실행합니다."); 
		} else {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");  
			return; 
		}
		while (true) {
			boolean found = false; 
			
			System.out.println("실행할 항목을 입력해 주세요"); 
			System.out.println("1.책 정보 수정 2.책 삭제 9.로그아웃"); 
			int select = Integer.parseInt(s.nextLine()); 
			
			switch (select) {
								case 1:
									bookInfoChange(); 
									break; 
								case 2: 
									System.out.println("삭제할 책의 제목을 입력하세요"); 
									String title = s.nextLine(); 
									for (int i=0; i<books.size(); i++) {
										if (books.get(i) != null) {
											if (books.get(i).getTitle().equals(title)) {
												books.remove(i); 
												System.out.println("삭제되었습니다."); 
												found = true; 
												break; 
											} 
										}
									}
									if (!found) {
										System.out.println("존재하는 책이 없습니다."); 
									}
									break; 
								case 9:
									return;  
			}
		}
	} 
	public void bookInfoChange() {
		while(true) {
			System.out.println("1.책 제목 수정 2.책 저자 수정 9.이전 단계"); 
			int select = Integer.parseInt(s.nextLine()); 
			boolean found = false; 
			
			switch (select) {
								case 1:
									System.out.println("수장할 책의 제목을 입력하세요"); 
									String title = s.nextLine(); 
									for (int i=0; i<books.size(); i++) {
										if (books.get(i).getTitle().equals(title)) {
											found = true; 
											break; 
										}
									}
									if (!found) {
										System.out.println("존재하는 책이 없습니다."); 
										break; 
									} else {
										System.out.println("책이 존재합니다."); 
									}
									
									System.out.println("책의 제목을 어떻게 바꾸시겠어요?"); 
									String cTitle = s.nextLine(); 
									for (int j=0; j<books.size(); j++) {
										if (books.get(j) != null) {
											if (books.get(j).getTitle().equals(title)) {
												books.get(j).setTitle(cTitle);
												System.out.println("수정되었습니다!"); 
												found = true; 
												break; 
											} 
										}
									}
									if (!found) {
										System.out.println("존재하는 책이 없습니다."); 
									}
									break; 
								case 2: 
									System.out.println("수장할 책의 제목을 입력하세요"); 
									title = s.nextLine(); 
									System.out.println("책의 제목을 어떻게 바꾸시겠어요?"); 
									String cAuthor = s.nextLine(); 
									for (int i=0; i<books.size(); i++) {
										if (books.get(i) != null) {
											if (books.get(i).getTitle().equals(title)) {
												books.get(i).setAuthor(cAuthor);
												System.out.println("수정되었습니다!"); 
												found = true; 
												break; 
											} 
										}
									}
									if (!found) {
										System.out.println("존재하는 책이 없습니다."); 
									}
									break; 
								case 9:
									return; 
		
			}
		}
	}
	public void add(Book book) {
		books.add(book); 
	}
	public List<Book> getBooks(){
		return books; 
	}
	public void print() {
		System.out.println(books); 
	}
	public void save() {
		try (
				BufferedWriter bi = new BufferedWriter(new FileWriter("src/RealTest/save.txt")); 
		){
			for (Book books : books) {
				bi.write("[첵 제목: " + books.getTitle() +
						", 책 저자: " + books.getAuthor() + "]\n"); 
			} 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}

class Book {
	private String title; 
	private String author; 
	
	public Book (String title, String author) {
		this.title = title; 
		this.author = author; 
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}
	public String getTitle() {
		return title; 
	}
	public void setAuthor(String author) {
		this.author = author; 
	}
	public String getAuthor() {
		return author; 
	}
	
	@Override
	public String toString() {
		return "제목: " + title + ", 저자: " + author; 
	}
	
}