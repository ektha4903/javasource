package ch6;


import ch5.Car;
import ch5.Student;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		Student student = new Student();
		
		//초기화 => 인자를 받는 생성자
		Account account = new Account("1222333","ㅎㅇㄱ",12222);
		//account.name="홍길동";
		//계좌번호 확인
		System.out.println(account.getAno());
		System.out.println(account.getBalance());
	}

}
