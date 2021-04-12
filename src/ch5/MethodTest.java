package ch5;

/* 메소드
 * 리턴타입 메소드명(매개변수){}
 * 
 * 메소드명은 숫자로 시작하면 안되고, $,_만 가능
 * 소문자로 시작(관례)
 * 서로 다른 단어가 혼합된 상태이면 뒤이어 오는 단어의 첫머리 글자는 대문자
 * ex0 getName(), startEngine()
 */

public class MethodTest {
	//리턴타입 true,false / 메소드명은 isRedirect / 매개변수는 없음
	boolean isRedirect() {
		return true; //void가 아니면 return 들어와야 함.
	}
	
	//정수 리턴, 두개의 정수 타입의 매개변수 받기, 전달받은 매개변수의 합 리턴, 메소드 이름은 sum
	int sum(int a,int b) {
		return a+b;
	}
	
	//정수 리턴(long), 두개의 정수 타입의 매개변수, 전달 받은 매개변수의 곱, 이름은 multiply
	long multiply(long a,long b) {
		return a*b;
	}
	
	//문자 리턴, 매개변수 없음, 이름은 method1, 문자열 A 리턴
	char method1() {
		return 'A';
	}
	
	//실수 리턴(double), 두 개의 실수 타입 매개변수, 이름은 divide, 전달받은 매개변수의 나누기 리턴
	double divide(double a, double b) {
		return a/b;
	}
	
	//정수형 배열 리턴, 하나의 정수 타입의 배열 매개변수, 이름은 getArr, 매개변수 받은거 리턴
	int[] getArr(int[] arr) {
		return arr;
	}
	
	//문자열 리턴, 문자열 매개변수 하나, 이름은 getName, 매개변수 받은거 리턴
	String getName(String str) {
		return str;
	}
	
	void print() {
		return; //=> return 뒤에 아무것도 없기 때문에 써도 되지만 void 다음에는 return을 거의 쓰지 않음
	}

}
