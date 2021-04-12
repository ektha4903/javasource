package ch3;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {

		//system.in : 키보드
		//system.out : 화면( 출력장치)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		// nextInt() : 값을 읽어올 때 공백(기본)을 기준으로 읽어옴
		// 15 20을 찍으면 15뒤에 공백이 있기때문에 15만 인식
		int num = sc.nextInt();
		System.out.println(num);
	
	}

}
