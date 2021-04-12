package ch7;
public class CheckingTrafficCardAccount extends CheckingAccount {
	//교통카드 기능 여부
	private boolean hasTrafficCard;

	public CheckingTrafficCardAccount(String ano, String ow, int balance, String cardNo,boolean hasTrafficCard) {
		super(ano, ow, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
		// TODO Auto-generated constructor stub
	}
	
	//교통비를 지불 - 교통카드가 있다면 
	//카드번호와 잔액확인 후 => 교통비 지출
	int payTrafficCard(String cardNo,int amount) {
		if(!hasTrafficCard) {
			System.out.println("교통 카드 기능이 없습니다.");
			return 0;
		}
		return pay(cardNo, amount);
	}

}
