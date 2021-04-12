package ch1;

// 자동 타입 변환 (Promotion)
// byte < short < int < long < float < double
// 작은 것을 큰 걸로 옮길 때는 자동으로 옮겨짐

public class PromotionEx1 {

	public static void main(String[] args) {
byte byteValue = 10;
// 큰 타입(4byte) = 작은타입 (1byte) <- 표시 방법

int intValue = byteValue;
System.out.println(intValue);

char charValue = '가';
// 큰 타입 (4byte) = 작은타입 (2byte)
intValue = charValue;
System.out.println(charValue);

intValue = 200;
// 큰 타입(8byte) = 작은타입 (4byte)
double doubleValue =  intValue;
System.out.println(doubleValue);

	}

}
