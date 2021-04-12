package ch1;

//char 타입 - 2byte 메모리 사용 => 문자를 표현할 때 쓰임
//   문자타입에는 '' 홑따옴표로 표현!
//   문자열타입에는 "" 쌍따옴표로 표현!
// 2byte = 16bit (0 ~ 2의 16승 -1) 0 ~ 65,535 => 문자는 -가 없기때문에 0부터 시작

public class CharVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch = 'A';

// ascii 코드 : 컴퓨터 키보드(숫자,특수문자,영어)에 있는 문자열을 숫자로 나타낸 값
char ch2 = 65;
char ch3 = 'a', ch4 = 97;

String str = "Ab";
// 문자열 앞에는 string이 들어와야함

System.out.println("ch="+ch+", ch2 ="+ch2);
System.out.println("ch3="+ch3+", ch4="+ch4);
System.out.println("str="+str);
// 쌍따옴표안에는 출력하고 싶은 것 넣기 - ch가 가진 값을 출력하려면 ch
// +는 연결하고 싶을 때
// 쌍따옴표 안쓰면 입력한 변수값이 나옴
	}

}
