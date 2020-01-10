package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile2 {

	public static void main(String[] args) {

		readFileMethod2();

	}
	
	public static void readFileMethod2(){
		InputStreamReader isr =null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = br.readLine()) != null || (line = br.readLine()) != "quit") {
				System.out.println(line); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void readFileMethod1(){
		InputStreamReader isr =null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("resources/CoveringLetter.txt")));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
