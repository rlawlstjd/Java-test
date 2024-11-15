package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {	
		try ( // 캐릭터 스트림 : 리더 라이터 ...   일반 인풋스트림 아웃풋 스트림 ->  바이트 스트림 
				InputStreamReader in = new InputStreamReader(new FileInputStream("./src/com/test/java/ch21/benson.txt"));
				OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("./src/test/dif1.txt"));
			) { 
				int c ; 
				while((c = in.read()) != -1) {
					out.write(c);
				}
			System.out.println("벤슨분"); 
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(); 
			
			
		try (
			FileReader in = new FileReader("./src/com/test/java/ch21/benson.txt");	
			FileWriter out = new FileWriter("./src/test/dif2");
				){
				
			int c ; 
			while ( (c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("벤슨분 일반 FileReader");
		} catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.println(); 
		
		try (
				BufferedReader in = new BufferedReader(new FileReader("./src/com/test/java/ch21/benson.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("./src/test/dif3"));
		){
			String c ; 
			while((c = in.readLine()) != null){
				out.write(c);
				out.newLine();
			} 
			System.out.println("벤슨분 Buffer Reader");
		} catch (IOException e) {
			e.printStackTrace();	
		}
		System.out.println(); 
		
		try (
				BufferedReader in = new BufferedReader(new FileReader("./src/com/test/java/ch21/benson.txt"));
				PrintWriter out = new PrintWriter(new FileWriter("./src/com/test/dif4"));
			){
			String line; 
			while ((line = in.readLine()) != null) {
				out.println(line); 
			}
			System.out.println("< FileWrite -> PrintWriter >"); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		System.out.println(); 
		
		
		System.out.println("범내려온다 "); 
		try (
				Scanner s = new Scanner(new FileReader("./src/com/test/java/ch21/benson.txt"));
				){
			while (s.hasNext()) {
				System.out.println(s.next());
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(); 
		
		
		System.out.println("범범범");
		try (
				Scanner s = new Scanner(new BufferedReader(new FileReader("./src/com/test/java/ch21/benson.txt")));
			){
				while (s.hasNext()) {
					System.out.println(s.next());
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}