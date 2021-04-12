package ch2;

public class ConditionalOperEx3 {

	public static void main(String[] args) {
		// 변수 num을 선언한 뒤 양수, 음수, 0인지 출력하시오
		// 변수에는 임의의 값을 부여한다(삼항연산자 사용)
		
		int a=3;
		System.out.println( (a>0)? "양수" : (a<0)? "음수" : "0");
// 위와 아래와 같음, 바로 출력해도 되고 변수에 넣어서 출력해도 됨
		String result = (a>0)? "양수" : (a<0)? "음수" : "0";
System.out.println(result);

}
}