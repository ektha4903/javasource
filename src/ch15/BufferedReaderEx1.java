package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("c:\\temp\\file1.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("c:\\temp\\output5.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			
			String str = null;
			while((str=br.readLine())!=null) {
				bw.write(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
