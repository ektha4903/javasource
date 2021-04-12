package ch2;

public class ArithmeticOperEx3 {

	public static void main(String[] args) {
		//int x = 1000000;
		//int y = 1000000;
		
		//int z = x*y;
		//System.out.println("z = "+z);
		// z가 int의 범위를 넘어버리기 때문에 틀린 값이 나옴
		// x와 y의 값은 int 범위내에 있지만 연산 후는 아님
		// long으로 바꿔줘야 하는데 long z로 바꾸는 건 의미가 없고 위에부터 long x,y로 바꿔줘야 함
		// long*int는 long으로 변환됨
		
		long x = 1000000;
	    int y = 1000000;
		
		long z = x*y;
		System.out.println("z = "+z);

	}

}
