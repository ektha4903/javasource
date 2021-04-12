package ch3;

public class ForEx2 {

	public static void main(String[] args) {
		// 1~10까지 합
		// sum = 1+2+3+4...
		int sum=0; // sum이라고 하는 변수를 그냥 설정 (임의로 0으로 설정)
		for(int i=1;i<11;i++) {
			sum = sum+i; // sum+=i라고 단축가능
		}
System.out.println("1~10까지 합 : "+sum);

sum = 0;
for(int i=1;i<101;i++) {
	sum = sum+i;
}
System.out.println("1~100까지 합 : "+sum);


	}

}
