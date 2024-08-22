package com.test.java.ch06;

public class Ex01ForTest {
	public static void main(String[] args) {
		
		int number = 2; 
		for (int a=1; a<=9; a++) {
			System.out.printf("%dx%d=%d\t",number,a, number*a); 
		}
		System.out.println();
		
		int [][] s = {
				{65},
				{60},
				{80}
		};
		
		for (int b=0; b< s.length; b++) {
			System.out.printf("학생 %d의 중간고사 성적은 %d%n", b+1, s[b][0]); 
		}
		
		int [][] e = {
				{80},
				{50},
				{60}
		};
		
		
		for (int c=0; c<e.length; c++) {
			for (int d=0; d<e[c].length; d++) {
				if (e[c][d]>=60) {
					System.out.printf("합격%n");
				}else {
					System.out.printf("불합격%n");
				}
			}
			
		}
	
	
	
	}
}
/*
문제 1.
구구단 중 2단만 출력하세요.
예) 
2x1=2 2x2=4 ... 2x9=18

문제 2.
학생 3명의 중간고사 점수가 저장된 배열을 만들고 임의의 점수를 저장한 뒤
for 문을 사용하여 출력하세요.

문제 3.
중간고사 점수가 저장된 배열의 점수를 출력하되 점수가 60점 이상일 경우에만 출력하고 60점 미만일 경우 "재시험"을 출력하는 코드를 작성하세요. 
*/