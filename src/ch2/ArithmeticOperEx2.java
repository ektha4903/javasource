package ch2;

public class ArithmeticOperEx2 {

	public static void main(String[] args) {
		char c1 = 'A'+1; //ascii코드로 A는 65 => 65+1 =B(66)
		char c2 = 'A';
				
        //char c3 = c2+1; -> char 타입의 변수를 가져와서 +1 한것
        //cannot convert from int to char -> int로 변환해라 java는 int로 요구함.
		int c3 = c2+1;
        
				System.out.println("c1 = "+c1);
				System.out.println("c2 = "+c2);
				System.out.println("c3 = "+c3);
				System.out.println("c3 = "+(char)c3); // ->casting 강제 변환으로 char로 바꿀 수 있음.

	}

}
