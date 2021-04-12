package ch3;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// 간단 계산기
		// 사용자에게 두 개의 숫자와 연산자를 입력받기
		// 입력받은 값에 의해서 계산한 후 줄력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 입력 :");
		//이 구문이 지금은 아래 있으면 안되요..이유에 대해서는 좀 뒤에 설명할게요!!
		String num3 = sc.nextLine(); // 연산자는 int로 받을 수 없다
		
		System.out.print("숫자 입력 :");
		int num = sc.nextInt();
		System.out.print("숫자 입력 :");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		switch (num3) {
		case "+":
			result = num+num2;
			break;
		case "-":
			result = num-num2;
			break;
		case "*":
			result = num*num2;
			break;
		case "/":
			result = num/num2;
			break;
		case"%":
			result = num%num2;
			break;
		}
		System.out.printf("%d %s %d = %d",num,num3,num2,result);
		// %d => int로 자리잡기  %s => string으로 자리잡기
	}

}
