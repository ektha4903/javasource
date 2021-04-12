package ch3;

import java.util.Scanner;

public class IfEx11 {

	public static void main(String[] args) {
		// 사용자로부터 3개의 정수를 입력받아 가장 작은 값을 출력하시오

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 :");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 :");
		int num2 = sc.nextInt();
		System.out.println("세번째 숫자 입력 :");
		int num3 = sc.nextInt();
		
		int min=num1;
		
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		System.out.println("제일 작은 숫자 :"+min);
		
		//제일 큰 숫자
		int max= num1;
		
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		System.out.println("제일 큰 숫자 :"+max);
	}

}
