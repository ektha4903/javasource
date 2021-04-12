package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {

	public static void main(String[] args) {
		// 키보드로 문자열을 읽어 "/"문자로 분리하는 프로그램 작성
		//예시) 아빠/엄마/수연/연스/수희 => 아빠 엄마 따로
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요(구분자는 /) : ");
		String input = sc.nextLine();
		StringTokenizer token = new StringTokenizer(input,"/");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
		
	}

}
