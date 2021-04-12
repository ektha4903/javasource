package ch5;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account("210-23-12345", "홍길동", 100000);
		System.out.println(account);
		
	
		account.deposit(2000);
		System.out.println("현재 잔액 : "+account.money);
		
		account.withdraw(10000);
		System.out.println("현재 잔액 : "+account.money);
		
		//int money=account.withdraw(10000);
		//System.out.println("현재 잔액 : "+money);
		
		//System.out.println("현재 잔액 : "+account.withdraw(10000));
	}

}
