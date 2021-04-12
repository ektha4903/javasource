package ch5;

public class CardEx2 {

	public static void main(String[] args) {
		// card1.width => 특정 객체에 속한 필드가 아님
		System.out.println("card 가로길이 :"+Card.width);
		System.out.println("card 세로길이 :"+Card.height);
		//static이 붙은 애들은 앞에 클래스를 붙여줌 => Card.--
		//new 필요없이 필드에서 불러다가 값을 낼 수 있음
	}
}
