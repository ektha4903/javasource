package ch3;

public class SwitchEx4 {

	public static void main(String[] args) {
		// 8~11 정수 추출
		int time= (int)(Math.random()*4)+8;
		System.out.println("[현재시간 : "+time+"]");
		
	//break가 없으면 값이 걸려도 밑까지 쭉 나옴 =>break필수
		switch (time) {
		case 8:
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의 진행");
			break;
		case 10:
			System.out.println("업무 진행");
			break;

		default:
			System.out.println("외근");
		}

	}

}
