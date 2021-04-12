package ch3;

public class IfEx7 {

	public static void main(String[] args) {
		// 중첩 if (if문 안에 if문을 계속 넣을 수 있음)
		// 점수가 81이상~ 100이하
		// Math.random()*20 => 0~19 값이 나옴
		int score = (int)(Math.random()*20)+81; //최소값이 81이 나오게 하기위함
		System.out.println("점수 : "+score);

		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
		}else {
			if(score>=85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("학점 : "+grade);
	}

}
