package ch3;

public class IfEx3 {

	public static void main(String[] args) {
		int score =88;
		
		if(score>=90) {
			System.out.println("점수가 90보다 크다");
			System.out.println("등급은 A");
	}else {
		System.out.println("점수가 90보다 작다");
		System.out.println("등급은 B");
	} //else에는 if에 맞지 않은 부분 (false부분)

}
}
