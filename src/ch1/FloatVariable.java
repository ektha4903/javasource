package ch1;

// float 타입 - 4byte 메모리 사용 =>실수형 (소수점, 지수)
// int보단 좀 크다
// 4byte = 32bit

// double 타입 - 8byte 메모리 사용
// 8byte = 63bit
// 부동 소수점 방식으로 저장되기 때문에 int, long과 달리 훨씬 더 큰 범위의 값 저장 가능

public class FloatVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float score = 90.17f;
// 90.17f -> 90.17을 float타입으로 쓸거야
double score2 = 98.56;
// 자바에서 소수점만 사용하는 값이라면 기본적으로 double로 인식됨
// => 그렇기 때문에 float로 쓸거면 소수뒤에 f를 꼭 붙여야함 but, double은 붙여도 되고 안붙여도 됨(옵션)

System.out.println("score ="+ score+", scoure2 = "+score2);

		
	}

}
