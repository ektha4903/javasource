package ch3;

import java.util.Scanner;

public class SwitchEx7 {

	public static void main(String[] args) {
		// 사용자에게 점수 입력받기
		// 해당 점수에 따라 A-F 등급 출력하기
		// 90점 이상 : A. 80점 이상 : B, 70점 이상 : C. 나머지는 F
		// 조건을 점수/10으로 해서 90점 이상은 9로 나타냄
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 :");
		int num = sc.nextInt();
		int result= num/10;
		
		switch (result) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;

		default:
			System.out.println("F");
			break;
		}

	}

}
