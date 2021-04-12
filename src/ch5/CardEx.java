package ch5;

public class CardEx {

	public static void main(String[] args) {
		Card card1 = new Card(7, "heart"); //=> new로 값을 부여 (static으로 선언한 애들은 필요X)
		print(card1);
		Card card2 = new Card(6, "spade");
		print(card2);
		
	}
	static void print(Card card) {
		System.out.println("card number :"+card.number);
		System.out.println("card 종류 :"+card.kind);
		System.out.println("card 가로길이 :"+Card.width);
		System.out.println("card 세로길이 :"+Card.height);
		//static이 붙은 애들은 앞에 클래스를 붙여줌 => Card.--
	}
}
