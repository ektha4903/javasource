 package ch3;

public class ForEx1 {

	public static void main(String[] args) {
		// 1~10까지 출력
		for(int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		} // 비우고 돌릴 수 있지만 무한 실행된다. 멈출 수 없음

		System.out.println();
		
		// 10~1까지 출력
		for(int j=10;j>=1;j--) {
			System.out.print(j+"  ");
		}
	}

}
