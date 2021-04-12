package ch11;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금
		account.deposit(100000);
		//출금
		try {
			account.withdraw(300000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
