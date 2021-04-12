package ch4;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화 => 한번에
		int score[]= {97,88,89,56,69};
		String name[]= {"park","kim","choi","lee","kim"};
		
		// 사용
//		for(int i=0;i<score.length;i++) {
//			
//			System.out.println(name[i]+"\t");
//			System.out.println(score[i]);
//		}
		
		//향상된 for문
		for(int s:score) { // :(콜론)을 기준으로 뒤쪽에는 배열
						   // 앞쪽에는 배열의 타입, 변수는 임의지정
			               // 변수명을 출력하면 배열이 나옴
			System.out.println(s);
		}
		
		for(String n:name) {
			System.out.println(n);
		}

	}

}
