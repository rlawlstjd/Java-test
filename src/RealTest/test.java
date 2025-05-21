package RealTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
    public static void main(String[]args) throws IOException {
       Scanner s = new Scanner(System.in);
       int a = 0; 
       System.out.println("입력하세요"); 
       if (a < s.nextInt()) {
    	   System.out.println("입력값이 a보다 큽니다."); 
       } else {
    	  System.out.println("입력값이 a보다 작습니다."); 
       }
    }
}
