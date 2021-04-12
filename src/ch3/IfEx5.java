package ch3;

public class IfEx5 {

	public static void main(String[] args) {
		// 점수에 따라서 등급 구현
		// 100~90 : A, 89~80 : B, 79~70 : C, 69~60 : D. 나머지 F =>조건 5개
		// if~else if~else
		
		int score = 75;
		char grade=' '; //초기화를 할 때 공백의 값을 넣고 싶으면 ' '처럼 한칸 띄어서
		//값은 if안에서 할당
		
		if(score>=90) {
			System.out.println("점수가 100~90");
			grade='A';
		}else if(score>=80) {
			System.out.println("점수가 89~80");
			grade='B';
		}else if(score>=70) {
			System.out.println("점수가 79~70");
			grade='c';
		}else if(score>=60) {
			System.out.println("점수가 69~60");
			grade='D';
		}else {
			System.out.println("점수가 60미만");
			grade='F';
		}
System.out.println("등급은 "+grade+" 입니다.");
System.out.printf("등급은 %c 입니다.",grade);
// char로 잡아놨기때문에 %c
// int로 잡으면 %d, float&double : %f, string : %s
	}

}
