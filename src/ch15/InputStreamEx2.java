package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		//바이트 기반 / 키보드로 입력
		InputStream in = System.in;
		//바이트 기반 / 화면
		OutputStream out = System.out;
		
		int input = 0;
		//키보드에서 읽어오는 => 입력 스트림에서 지정된 byte 수만큼 읽어오기
		byte[] b = new byte[100];
		try {
			while(in.read(b)!=-1) {
				//System.out.println(b); //주소값
				out.write(b);
			}
			in.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
