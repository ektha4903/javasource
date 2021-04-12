package ch2;

public class ConditionalOperEx4 {

	public static void main(String[] args) {
		// 문자형 변수 ch를 선언하고 임의의 값을 넣은 후
		// ch가 영문자이거나 숫자일 때만 true가 나오는 프로그램 작성
		
		char a = 'A';
		System.out.println((65<=a&&a<=90) || (97<=a&&a<=122) || (48<=a&&a<=57)? "true" : "false" );
		boolean result = (65<=a&&a<=90) || (97<=a&&a<=122) || (48<=a&&a<=57)? true : false;
		System.out.println(result);
char ch = 'z';

	}

}
