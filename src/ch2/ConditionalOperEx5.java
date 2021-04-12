package ch2;

public class ConditionalOperEx5 {

	public static void main(String[] args) {
		// 임의의 정수 변수를 선언한 후 , 그 숫자가 홀수인지 짝수인지 출력하기
		
		int a = 3;
		System.out.println((a%2==0?"짝수": "홀수"));
		
		// 위아래 둘다 맞음
		String result = a%2==0?"짝수":"홀수";
		System.out.println(result);

	}

}
