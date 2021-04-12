package example;

import java.util.Scanner;

public abstract class Calc {
	
	int a,b;
	Scanner sc = new Scanner(System.in);
	abstract int calculate();
	
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void input() {
		System.out.print("Input Num1 : ");
		a = sc.nextInt();
		System.out.print("Input Num2 : ");
		b = sc.nextInt();
	}
	void run() {
		input();
		int result = calculate();
		System.out.println(result);
	}
}
