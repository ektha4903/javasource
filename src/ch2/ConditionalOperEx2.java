package ch2;

public class ConditionalOperEx2 {

	public static void main(String[] args) {
		int score=85;
		
		char grade=(score>90)?'A':((score>80)?'B':'C');
		System.out.println("등급 : "+grade);
 // 이런식으로 중첩 가능
		// but, if문을 더 많이 씀
	}

}
