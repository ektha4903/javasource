package ch3;

import java.util.Scanner;

public class BankEx2 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 >> ");
			
			// 1번일때 예금액 입력받기
			//잔액 = 잔액 + 예금
			
			//2번 : 출금액 입력받기
			//잔액 = 잔액 - 출금
			
			//3번 : 현재까지의 잔액 출력
			
			//4번 : 프로그램 종료
			
			int menu = sc.nextInt();
		
			switch (menu) {
			case 1:
			System.out.print("예금액 >> ");
			//int money = sc.nextInt();
			//balance +=money;
			balance += sc.nextInt();
			break;
			case 2:
				System.out.print("출금액 >> ");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔액 >> "+balance);
				break;
			case 4:
				run=false;

		}
			
		}
		System.out.println("종료");
	}

}
