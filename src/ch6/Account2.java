package ch6;


 public class Account2 {
	// 은행계좌 클래스
	// 속성 - 계좌번호(210-23-12345), 이름(홍길동), 잔액(100000)

	private int balance;
	final static int MIN_BALANCE=0;
	final static int MAX_BALANCE=1000000;

	
	
	//setter와 getter를 작성하기
	//0 <= balance <= 1000000 범위의 값만 가짐
	//0과 1000000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
	//setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE)
			return;
		this.balance = balance;
	}
	


	// 기능(동작) - 입금한다. 출금한다
	// 입금한다(deposit) - 정수형태의 매개변수 하나(입금액), 현재잔액 += 입금액, return은 없음
	// 출금한다(withdraw) - 정수형태의 매개변수 하나(출금액), 현재잔액 -= 출금액, 현재 잔액 리턴
 }
