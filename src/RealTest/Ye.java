package RealTest;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ye {
	static Board[] boardArr = new Board[100]; 
	static Scanner s = new Scanner(System.in);
	static String loginId; 
	
	public static void initDate() throws ParseException{
		// 배열의 샘플 데이터 
		// 1페이지: 0~4, 2페이지: 5~9 3페이지: 10 ~ 14 ; 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		boardArr[0] = new Board("게시글제목1", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[1] = new Board("게시글제목2", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[2] = new Board("게시글제목3", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[3] = new Board("게시글제목4", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		
		boardArr[4] = new Board("게시글제목5", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[5] = new Board("게시글제목6", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[6] = new Board("게시글제목7", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[7] = new Board("게시글제목8", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		
		boardArr[8] = new Board("게시글제목9", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[9] = new Board("게시글제목10", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardArr[10] = new Board("게시글제목11", "내용입니다1", "user01", sdf.parse("2025-01-27")); 

	}
	
	
	public static void main(String[] args) {
		MemberExe exe = MemberExe.getInstance(); 
		
		while(true) {
			// id, password 일치하면 글목록기능 사용. 
			System.out.println("아이디를 입력하세요"); 
			String id = s.nextLine(); 
			System.out.println("비밀번호를 입력하세요"); 
			String password = s.nextLine(); 
			String name = exe.login(id,  password); 
			if (name != null) {
				loginId = id; // 여러 메소드 공유사용 . 
				System.out.println(name + "님 환영합니다."); 
				break; 
			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다."); 
			}
		}
		
		boolean run = true; 
		try {
				initDate();
		} catch (ParaseException e) {
			
		}
		
	}
}
class Member {
	private String memberId; 
	private String password; 
	private String memberName; 
	
	public Member(String memberId, String password, String memberName) {
		this.memberId = memberId; 
		this.password = password; 
		this.memberName = memberName; 
	}
	
	public String getMemberId() {
		return memberId; 
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId; 
	}
	public String getPassword() {
		return password; 
	}
	public void setPassword(String password) {
		this.password = password; 
	}
	public String getMemberName() {
		return memberName; 
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName; 
	}

}

class MemberExe {
	// 싱글톤 객체 생성. 
	// 1. 필드를 static 선언. 
	private static MemberExe instance = new MemberExe(); 
	// 생성자 은닉 
	private MemberExe() {
	}
	// 인스턴스를 제공해주는 메소드 . getInstance() 
	public static MemberExe getInstance() {
		return instance; 
	}
	
	Member[] members = {
						new Member("user01", "1111", "홍길동"), 
						new Member("user02", "2222", "김민수"),
						new Member("user03", "3333", "박석민"), 
	}; 
	
	public String login (String id, String password) {
		for (int i=0; i<members.length; i++) {
			if (members[i] != null && members[i].getMemberId().equals(id) && members[i].getPassword().equals(password)) {
				return members[i].getMemberName(); 
			}
		}
		return null;  // 일치하는 것이 없음 // return은 메소드를 끝내는 코드이기도 함. 
	}
}

class Board {
	private String title; 
	private String content; 
	private String writer; 
	private Date writeDate; 
	
	
	// 생성자 
	public Board(String title, String content, String writer, Date writeDate) {
		this.title = title; 
		this.content = content; 
		this.writer = writer; 
		this.writeDate = writeDate; 
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}
	public String getTitle() {
		return title; 
	}
	public void setContent(String content) {
		this.content = content; 
	}
	public String getContetnt() {
		return content; 
	}
	public void setWriter(String writer) {
		this.writer = writer; 
	}
	public String getWriter() {
		return writer; 
	}
	public void setWriterDate(Date writeDate) {
		this.writeDate = writeDate; 
	}
	public Date getWriteDate() {
		return writeDate; 
	}
	
	@Override
	public String toString() {
		return "제목: " + title + ", 내용: " + content + ", 저자: " + writer + ", 작성일시: " + writeDate; 
	}
	
}
