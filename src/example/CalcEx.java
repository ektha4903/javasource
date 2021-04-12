package example;

import java.util.Scanner;

public class CalcEx {
	public static void main(String[] args) {
		
		//연산자에 의해서 생성되는 객체가 다르게 하고 싶은거죠? => 이런 경우에는 main 에서 연산자 기호를 받는 부분이 들어와야 해요
		//왜냐면 Calc 에 넣어두면 Calc 는 객체를 생성할 수 없으니까 익명구현이던 이렇게라도 무조건 구현하는 클래스가 들어와야
		//input()을 부를 수 있거든요. 그러니까 여기서 연산자를 받고, 숫자도 받아줘야 해요...안그러면 추상클래스에 있는 input은 의미가 없어요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Operator : ");
		String str = sc.next();
		
		switch (str) {
		
		case "+":
			Calc add = new Add();
			add.run();
			break;
		
		case "-":
			Calc sub = new Sub();
			sub.run();
			break;
			
		case "*":
			Calc mul = new Mul();
			mul.run();
			break;
			
		case "/":
			Calc div = new Div();
			div.run();
			break;

		}
		
		
		

	}

}
