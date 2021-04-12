package ch12;

public class StringEx4 {

	public static void main(String[] args) {
		String str1 = "abcdefg";
		
		//contains = 들어있으면 true 아니면 false (문자열을 가지고 있니 없니!)
		System.out.println(str1.contains("ab"));
		
		String str2 = "자바 프로그래밍";
		//프
		
		System.out.println(str2.contains("프")?"들어있음":"없음");
		
		if(str2.contains("프")== true) {
			System.out.println("프가 존재함");
		}else {
			System.out.println("존재 노노");
		}
		
	}

}
