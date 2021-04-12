package ch3;

import java.util.Scanner;

public class IfEx12 {

	public static void main(String[] args) {
		// 사용자로부터 키와 몸무게를 입력받고, 사용자의 키에 알맞는 표준체중을 계산한후
		// 표준체중보다 많으면 "과체중", 적으면 "저체중, 동일하면 "표준"이라는 결과 출력하기
		// 표준체중 = (키-100)*0.9 =>int로 형번환
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게 :");
		int num = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("키 :");
		int num2 = sc2.nextInt();
		
		int num3=(int)((num2-100)*0.9);
		
		if(num>num3) {
			System.out.println("과체중");
		}else if(num<num3) {
			System.out.println("저체중");
		}else if(num==num3) {
			System.out.println("표준");
		}
		
		

	}

}
