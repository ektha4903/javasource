package ch3;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {

		//system.in : 키보드
		//system.out : 화면( 출력장치)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 ");
		// nextLine() : \n을 기준으로 읽어롬
		//String str = sc.nextLine();
		String str = sc.next();
		// next() : 공백을 기준으로 읽어옴
		System.out.println(str);
	
	}

}
