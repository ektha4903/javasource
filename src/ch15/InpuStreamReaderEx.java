package ch15;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InpuStreamReaderEx {

	public static void main(String[] args) {
		// 읽어올 파일 => FileInputStream -> InputStreamReader -> 프로그램 관리
		
		
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"))) {
			int data=0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
