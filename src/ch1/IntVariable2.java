package ch1;

// int 타입 - 4byte의 메모리 사용
// 4byte = 32bit (-2의 31승 ~ 2의 31승 -1) 



//byte, char, short, int, long : 정수형 데이터 담을 때 사용
public class IntVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1=10;
		int var2=012;  
//		8진수
		int var3=0xA;
//		16진수
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
	}

}
