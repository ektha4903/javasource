package ch3;

// break; 반복문을 중지할 때 사용, 주로 if문과 같이 사용됨.

public class BreakEx1 {

	public static void main(String[] args) {
		// if(sum>100)
		int sum=0, i=0;
		
		while(true) { //true로 쓸 때는 break를 꼭 걸어줘야 함
			if(sum>100) {
				break;
			}
			++i;
			sum+=i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}

}
