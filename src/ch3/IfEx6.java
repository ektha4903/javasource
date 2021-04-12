package ch3;

public class IfEx6 {

	public static void main(String[] args) {
	// 주사위 번호 뽑기 1~6   =>임의의 숫자를 뽑을 때 많이 쓰임
		
		// 0.0 <= Math.random() <1.0 - double타입의 임의의 숫자가 나옴
		// 1~10정수를 나타내고 싶으면 
		// 0.0*10<= Math.random() <1.0*10
		// 0+1 < (int) Math.random() < 10+1
		
		//int num = (int)(Math.random()*10)+1;
		
		
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번");
		} else if(num==2) {
			System.out.println("2번");
		} else if(num==3) {
			System.out.println("3번");
		} else if(num==4) {
			System.out.println("4번");
		} else if(num==5) {
			System.out.println("5번");
		} else if(num==6) {
			System.out.println("6번");
		}
		

	}

}
