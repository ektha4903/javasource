package ch1;

// 강제 타입 변환 ( Casting)
// 작은 크기 타입 = (작은 크기 타입)큰 크기 타입 <-표시방법
// 값이 달라질 수 있으니 조심히 써야 한다.
public class CastingEx2 {

	public static void main(String[] args) {
int num1 =  123456780;
int num2 = 123456780;
 
//double num3 = num2;
//자동형변환
float num3 = num2;
// float타입은 부호를 표현하는데 1비트, 지수를 표현하는데 8비트, 가수를 23비트를 사용한다.
// 값이 23비트를 넘어가면 손실되는 값이 생긴다.
// double은 부호 1비트, 지수 11비트, 가수 52비트 -> 그렇기 때문에 표현하지 못하는 수가 거의 없다.
System.out.println("num3 = "+num3);
num2 = (int) num3;
// 강제형변환
int result = num1 - num2;
System.out.println("result = "+result);
// 형변환을 할 때 잘못된 값이 나올 수 있다.
	}

}
