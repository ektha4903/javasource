package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyEx {

	public static void main(String[] args) {

		//FileNotFoundException => checked Exception
		FileInputStream fis = null;
		FileInputStream fos = null;
		try {
			fis = new FileInputStream("input.txt");
			fos = new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {//예외 여부와 상관없이 무조건 수행 - 자원 해제
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//IOException
			
		}
		
		
	}

}
