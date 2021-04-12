package ch2;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 사용자에게 정수를 입력받아 그 숫자가 짝수이지 홀수인지 판별
		
		Scanner sc=new Scanner(System.in); //system.in 사용자한테 입력받아 올 거야
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt(); // 밑에 입력한 값을 int로 가져와서 num에 담을거야
		
		System.out.println(num%2==0?"짝수":"홀수");
		

	}

}
