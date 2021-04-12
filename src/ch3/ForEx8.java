package ch3;

public class ForEx8 {

	public static void main(String[] args) {
		// 1~100까지 정수 중에서 3의 배수만을 더하기
		// (단, 9의 배수는 안 더하기)
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%9!=0) {
				sum+=i;
			}
	
		}
System.out.println("3의 배수(9의 배수는 제외)의 총 합 : "+sum);
	}

}
