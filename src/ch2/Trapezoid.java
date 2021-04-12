package ch2;

public class Trapezoid {

	public static void main(String[] args) {
		//사다리꼴의 넓이를 구한 후 출력하시오
		// 윗면 : 5, 아랫변 : 10. 높이 : 7

		double a = 5;
		int b = 10;
		int c = 7;
		
		double result = (a+b)*c/2;
		System.out.println("넓이 = "+ result);
		double result2 = (a+b)*c/2;
		System.out.println("넓이 = "+ result2);
	}

}
