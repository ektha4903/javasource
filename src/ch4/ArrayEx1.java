package ch4;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 100명의 정수를 변수에 담아서 처리
		
		//배열 선언 =>[] 위치는 상관없음
		int[] score;
		String name[];

		//배열 생성
		score = new int[5];
		name = new String[5];
		
		//초기화
		score[0]=97;
		score[1]=88;
		score[2]=89;
		score[3]=56;
		score[4]=69;
		
		name[0]="park";
		name[1]="kim";
		name[2]="choi";
		name[3]="lee";
		name[4]="kim";
		
		//배열 사용 : int 기본 값 = 0
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		//String : 기본값 = null
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
	}

}
