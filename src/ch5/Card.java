package ch5;

public class Card {
	// 속성 - 숫자, 종류(다이아몬드,스페이드,클로버,하트), 너비
	// 필드 (인스턴스 필드, 프로퍼티, 멤버변수)
	int number;
	String kind;
	
	// static - 정적필드(고정값) 초기화도 같이 하는게 일반적임
	// 값이 고정됐기 때문에 생성자 필요없음
	static int width=100;
	static int height=100;
	
	
	public Card(int number, String kind) {
		super();
		this.number = number;
		this.kind = kind;
	}
	
	
	
}
