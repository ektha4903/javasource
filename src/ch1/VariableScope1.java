package ch1;

public class VariableScope1 {

//	변수의 유효범위 - 어디서 선언됐는지에 따라서 달라짐
	// 선언된 블록 내에서만 사용가능
	public static void main(String[] args) {
 int value = 15;
 //int v2;
 {
	int v2 = value + 20;
	System.out.println(v2);
 }
// {}사이에서만 출력 가능 - v2는 이 블록 이외에서는 사용 불가 -> 컴파일 에러남
 // main 블록내에서는 모두 가능
System.out.println(value);
	}

}
