package ch1;

// byte 타입 - 메모리 사용 1byte만 사용
//byte = 8bit(-2의 7승 ~ 2의 7승 -1) : -128 ~ 127 (값) 표현 가능


public class ByteVariable1 {
	public static void main(String[] args) {
//		변수 : 하나의 값을 저장할 수 있는 메모리 공간, 변화를 줄 수 있음
//		상수 : 변하지 않고 항상 같음
//		타입 변수명; - 변수 선언 (변수명은 소문자로 시작해야함)
//	 기본 타입 : boolean, byte, char, short, int, long, float, double (암기필요)
		
//		byte age = 10;
//		byte maxSpeed = 20;
		byte age=10, maxSpeed=20;
// 변수 선언과 값 할당을 같이 (선언과 할당이 있어야 출력가능)
		System.out.println("age = "+age);
		System.out.println("maxSpeed = "+maxSpeed);
//		sysout 화면 출력
	}
}
