package com.test.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex09TreeSetTest {
	 public static void main(String[] args) {
		 Integer[] r = {11,23,32,45,51,67,73,84,98,100}; 
		 
		 List<Integer> r1 = new ArrayList<>(); 
		 Collections.addAll(r1, r); 
		 
		 NavigableSet<Integer> rate = new TreeSet<>(r1);
		 
		 System.out.println("60점 이상인 학생들의 점수를 출력하세요. 60점을 포함합니다."); 
		 System.out.println(rate.headSet(60, true));
		 
		 
		 System.out.println("학생들의 시험 점수 중 가장 높은 학생의 점수를 출력하세요."); 
		 System.out.println(rate.pollLast());
		 
		 
		 System.out.println("80점 보다 가장 근접하게 높은 점수를 출력하세요."); 
		 System.out.println(rate.higher(80)); 
		 
		 
		 System.out.println("75점을 찾아 출력하세요. 없다면 75보다 가장 근접하게 낮은 점수를 출력하세요."); 
		 System.out.println(rate.floor(75));
	 
	 }
}

/*
문제 1.
60점 이상인 학생들의 점수를 출력하세요. 60점을 포함합니다.

문제 2.
학생들의 시험 점수 중 가장 높은 학생의 점수를 출력하세요.

문제 3.
80점 보다 가장 근접하게 높은 점수를 출력하세요.

문제 4.
75점을 찾아 출력하세요. 없다면 75점 보다 가장 근접하게 낮은 점수를 출력하세요.
*/