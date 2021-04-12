package ch6;


 public class Account {
	// 은행계좌 클래스
	// 속성 - 계좌번호(210-23-12345), 이름(홍길동), 잔액(100000)
	private String ano;
	private String ow;
	private int balance;
	
	
	public Account(String ano, String ow, int balance) {
		super();
		this.ano = ano;
		this.ow = ow;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOw() {
		return ow;
	}

	public void setOw(String ow) {
		this.ow = ow;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
 }

