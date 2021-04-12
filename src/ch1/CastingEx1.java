package ch1;

// 강제 타입 변환 ( Casting)
// 작은 크기 타입 = (작은 크기 타입)큰 크기 타입 <-표시방법

public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 103029; //
		byte byteValue = (byte)intValue;
		//byte byteValue = intValue;
						// 큰 것을 작은 걸로 옮길 때 손실되는 부분이 생김
System.out.println(byteValue);

// 103029 -> 117 손실
	}

}
