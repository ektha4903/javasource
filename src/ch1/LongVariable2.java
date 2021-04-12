package ch1;

// long 타입 - 8byte 메모리 사용
// 8byte = 64bit (-2의 63승 ~ 2의 63승 -1)



public class LongVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long val1 = 123456789L;
// l,L은 옵션
// int 타입의 저장 범위를 넘어서는 정수 값에는 L을 반드시 붙여야 함.
// long val2 = 100000000000000; ->컴파일 에러가 남
// long val2 = 100000000000000L; -> 에러X
long val2 = 100000000000000L;
long val3 = 20L;
// 숫자가 작으면 L을 옵션형으로 쓸 수 있지만 숫자가 커지면  L을 필수로 붙여야 함.


// 타입을 정할 때는 내가 담을 값(vlaue)에 따라 달라진다.
// 주로 연산에 이용되는 타입은 int타입

System.out.println("val1="+val1);
	}

}
