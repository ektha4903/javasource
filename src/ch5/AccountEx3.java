package ch5;

public class AccountEx3 {

	public static void main(String[] args) {
		Account account = new Account("210-23-12345", "홍길동", 100000);

		//입금한다
		account.deposit(2000);
		AccountEx3 obj = new AccountEx3(); // 외부 클래스의 메소드를 호출하고 사용할때는 객체 생성 필요
		obj.accountprint(account);
		//출금한다
		account.withdraw(10000);
		obj.accountprint(account);
		
		Account account2 = new Account("123-45-6788", "황길동", 200000);
		//입금한다
		account2.deposit(2000);
		obj.accountprint(account2);
		//출금한다
		account2.withdraw(10000);
		obj.accountprint(account2);
		//int money=account.withdraw(10000);
		//System.out.println("현재 잔액 : "+money);
		//System.out.println("현재 잔액 : "+account.withdraw(10000));
	}
	 void accountprint(Account obj) {
		System.out.println(obj.name+"잔액 확인 : "+obj.money);
	}
}
