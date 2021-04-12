package ch3;

public class ForEx12 {

	public static void main(String[] args) {
		// 정수 12345 를 선언하고 각 자릿수를 더한 결과를 출력하기
		// 1+2+3+4+5 = 15

		//int plus = 0;
		//for(int i=1;i<=5;i++) {
			//plus=plus+1;
		//}
		//System.out.println(plus);
		
		int num = 12345;
		int sum = 0;
		for(;num!=0;) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println("각 자릿수의 합 : "+sum);
	}

}

