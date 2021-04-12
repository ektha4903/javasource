package ch5;

public class AccountEx4 {

	public static void main(String[] args) {
		// Account 배열객체
		
		Account accArr[]=new Account[10];
		
		for(int i=0;i<5;i++) {
			accArr[i]=new Account();
			
		}
		print(accArr);
	}
	
	static void print(Account accArr[]) {
		System.out.println("********************");
		for(Account account:accArr) {
			System.out.print("계좌번호 : "+account.num);
			System.out.print(" 이름 : "+account.name);
			System.out.print(" 잔액 : "+account.money);
			System.out.println();
		}
	}

}
