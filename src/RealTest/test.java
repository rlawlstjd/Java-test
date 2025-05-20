package RealTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("두 정수를 입력하세요"); 
        String line = br.readLine(); 
        String[] parts = line.split(" "); 
        int a = Integer.parseInt(parts[0]); 
        int b = Integer.parseInt(parts[1]);
        
        // 예: 결과 출력
        System.out.println(a + b);
    }
}
