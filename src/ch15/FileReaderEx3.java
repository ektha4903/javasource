package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileReaderEx3 {

	public static void main(String[] args) {
		// 특정 소스파일을 읽어서 화면에 출력하기
		//출력을 할때 행번호를 붙여서 보여주기
		// src/ch5/BufferedInputStreamEx1.java
		
		try(FileInputStream fis = new FileInputStream("c:\\javasorce");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			int data = 0;
			while((data=bis.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
