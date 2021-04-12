package ch1;

public class VariableScope2 {

//	변수의 유효범위 - 어디서 선언됐는지에 따라서 달라짐
	// 선언된 블록 내에서만 사용가능
	public static void main(String[] args) {
 int value = 15;
 int v2=0; // not have been initialized : 할당된 값 없음 (초기화 안했음)
 //int v2;
 if(value>10) {
	 v2 = value-5;
 }

System.out.println(v2);
// 출력문에서의 띄어쓰기는 중요
	}

}
