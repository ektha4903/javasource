package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx4 {

	public static void main(String[] args) {
//		FileInputStream fis=null;
//		FileOutputStream out=null;
//		try {
//			File f = new File("c:\\temp\\KakaoTalk_20210410_160019590.mp4");
//			//바이트 기반 파일 읽기
//			fis = new FileInputStream(f);
//			//바이트 기반 화면 출력
//			out = new FileOutputStream("c:\\temp\\KakaoTalk_20210410_160019590(1).mp4");
//			
//			byte b[] =new byte[100];
//			while(fis.read(b)!=-1) {
//				out.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
			File f = new File("c:\\temp\\KakaoTalk_20210410_160019590.mp4");
			try(FileInputStream fis= new FileInputStream(f);
					FileOutputStream out= new FileOutputStream("c:\\temp\\KakaoTalk_20210410_160019590(1).mp4");) {
				byte b[] =new byte[100];
				while(fis.read(b)!=-1) {
					out.write(b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	

}
