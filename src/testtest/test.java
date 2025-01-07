package testtest;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		
        int[][] student = {
                {10, 20, 33, 32},
                {45, 25, 43, 21},
                {73, 85, 13, 49}
        };
        
        int total = 0;
        for (int i=0; i<student.length; i++) {
        	for(int j=0; j<student[i].length; j++) {
        		total += student[i][j];
        	}
        }
        System.out.println(total);
        
        String[][] cart = {
        		{"티비", "라디오"}, 
        		{"핸드폰", "티비", "mp3"}
        };
        for (int i=0; i<cart.length; i++) {
        	for (int j=0; j<cart[i].length; j++) {
            	System.out.println(cart[i]);

        	}
        }
        
	}
}
