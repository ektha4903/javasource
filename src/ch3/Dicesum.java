package ch3;

public class Dicesum {

	public static void main(String[] args) {
		// while문과 Math.random()을 이용해서 두 개의 주사위를 던졌을 때
		// 나오는 값을 (값1,값2) 형태로 출력하고, 두 개 주사위의 값이 5가 아니면
		// 계속 주사위를 던지고 합이 5이면 실행을 멈추는 코드를 작성하시오.
		
		
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d , %d)\n",dice1,dice2);
			
			if(dice1+dice2==5) {
				break;		
				
			}
		}

	}

}
