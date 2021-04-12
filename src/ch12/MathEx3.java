package ch12;

public class MathEx3 {

	public static void main(String[] args) {
		// 1~3까지 난수를 3개 생성한 뒤 한 줄에 출력하기
		// 모두 같은 수가 나올 때까지 반복하고, 모두 같은 수이면 성공 출력한 후 프로그램 종료
		
		//2 1 2
		//2 4 2
		//1 3 3
		//1 1 1
		// 성공
		
		while(true) {
			int num1 = (int)(Math.random()*3)+1;
			int num2 = (int)(Math.random()*3)+1;
			int num3 = (int)(Math.random()*3)+1;
			
			System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
			
			if(num1 == num2 && num1 == num3) {
				System.out.println("성공");
				break;
			}
		}
	}

}
