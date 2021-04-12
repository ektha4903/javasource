package ch1;

// float 타입 - 4byte 메모리 사용 =>실수형 (소수점, 지수)
// int보단 좀 크다
// 4byte = 32bit

// double 타입 - 8byte 메모리 사용
// 8byte = 63bit
// 부동 소수점 방식으로 저장되기 때문에 int, long과 달리 훨씬 더 큰 범위의 값 저장 가능

public class FloatVariable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float score = 0.1234567890123456789f;
double score2 = 0.1234567890123456789;
// float와 double은 정밀도 부분에서 차이가 남
// double이 더 많이 크게 표현 가능

//정수형 타입에서는 int , 실수형 타입에서는 double이 대체로 쓰인다.

System.out.println("score ="+ score+", scoure2 = "+score2);

		
	}

}
