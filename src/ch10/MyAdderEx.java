package ch10;

import java.util.Scanner;

public class MyAdderEx {

	public static void main(String[] args) {
		
		MyAdder adder = new MyAdder();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("두 수의 합은 : "+adder.plus(x, y));
		
		System.out.print("숫자를 입력하세요 >>");
		int n = sc.nextInt();
		System.out.printf("%d까지 정수의 합은 : %d",n,adder.sum(n));

	}

}
