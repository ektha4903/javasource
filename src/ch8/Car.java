package ch8;

public class Car {
	
	//필드
	Tire frontLeftTire = new Tire(6,"앞왼쪽"); //앞쪽 왼쪽 바퀴
	Tire frontRightTire = new Tire(2,"앞오른쪽"); //앞쪽 오른쪽 바퀴
	Tire backLeftTire = new Tire(3,"뒤왼쪽"); //뒤쪽 왼쪽 바퀴
	Tire backRightTire = new Tire(4,"뒤오른쪽"); //뒤쪽 오른쪽 바퀴
	
	// 초기화 과정이 필요함 ( 초기값은 null상태) => 인자를 받는 생성자 만들기
	// 초기화 한 값을 변경하고 싶을 때 => setter 메소드 이용
	
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if(!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if(!backLeftTire.roll()) {
			stop();
			return 3;
		}
		if(!backRightTire.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
