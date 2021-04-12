package ch5;


public class Account {
	// 은행계좌 클래스
	// 속성 - 계좌번호(210-23-12345), 이름(홍길동), 잔액(100000)
	String num;
	String name;
	int money;
	
	// 생성자 - 기본 생성자, 인자를 받는 생성자(속성 모두를 초기화할 수 있는)
//	 Account() {}
//	 Account(String num,String name,int money) {
//		this.num=num;
//		this.name=name;
//		this.money=money;
//	}
	
	public Account() {
		super();
	}

	public Account(String num, String name, int money) {
		super();
		this.num = num;
		this.name = name;
		this.money = money;
	}
	
	


	// 기능(동작) - 입금한다. 출금한다
	// 입금한다(deposit) - 정수형태의 매개변수 하나(입금액), 현재잔액 += 입금액, return은 없음
	// 출금한다(withdraw) - 정수형태의 매개변수 하나(출금액), 현재잔액 -= 출금액, 현재 잔액 리턴
	
	void deposit(int amount) {
		money+=amount;
	}
	
	int withdraw(int amount) {
		money-=amount;
		return money;
	}

}
