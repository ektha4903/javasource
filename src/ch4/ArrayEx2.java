package ch4;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열 선언, 생성
		int score[]=new int[5];
		String name[]=new String[5];
		
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
		
		// 사용
		System.out.println("score.length "+score.length);
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}

	}

}
