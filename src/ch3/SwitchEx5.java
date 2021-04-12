package ch3;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// 가위, 바위, 보 게임
		// 사용자가 내는 가위(1)바위(2)보(3) 입력받기
		// 컴퓨터가 내는 부분 => math.random 추출
		// 누가 이겼는지 출력하기
		
		Scanner sc= new Scanner(System.in);
		System.out.println("사람 : ");
		int num = sc.nextInt();
		int num2= (int)(Math.random()*3)+1;
		System.out.println("컴퓨터 : "+num2);
		int result = num-num2;
		
		
		switch (result) {
		case 1:
			System.out.println("승리");
			break;
		case -2:
			System.out.println("승리");
			break;
		case 0:
			System.out.println("무승부");
			break;

		default:
			System.out.println("패배");
			break;
		}
				
	}

}
