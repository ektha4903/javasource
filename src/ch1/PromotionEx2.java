package ch1;

// 자동 타입 변환 (Promotion)
// byte < short < int < long < float < double
// 작은 것을 큰 걸로 옮길 때는 자동으로 옮겨짐

public class PromotionEx2 {

	public static void main(String[] args) {
byte byteValue1 = 10, byteValue2=20;
// 큰 타입(4byte) = 작은타입 (1byte)

int intValue = byteValue1 + byteValue2;
System.out.println(intValue);

//byte byteResult = byteValue1 + byteValue2;
// byte끼리 더하면 int로 자동 변환이 된다 = 틀린 명령어
// 그래서 앞에 타입을 잘 써야 한다

double doubleValue = 5.5;
double result=intValue+doubleValue;
System.out.println(result);
//int result=intValue + doubleValue
// int는 4바이트 double은 8바이트 -> 큰걸로 자동 변환되니까 큰걸 앞에 넣어야함 = double

char charValue1 = 'A'; //ascii코드로 A는 65
char charVlaue2 = 1;
//char resultValue =  charValue1+charVlaue2;
// char값끼리 더하면 자동으로 변환이 일어남 -> int
int resultValue =  charValue1+charVlaue2;
System.out.println(resultValue);
	}

}
