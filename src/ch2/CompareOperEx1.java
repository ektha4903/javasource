package ch2;

// 비교 연산자 : <,<=,>,>=,==(같은가에 대해서 물어볼 때),!=(다른가에 대해서 물어볼 때)
// 결과값은 boolean타입으로 나온다. (true, flase)

public class CompareOperEx1 {

	public static void main(String[] args) {
		int num1 = 10, num2=10;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<=num2);
		
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println(ch1<ch2);

	}

}
