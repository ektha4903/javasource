package ch12;

public class StringEx12 {

	public static void main(String[] args) {
		String str1 = "AbZquartKgu";
		
		//문자열 거꾸로 출력하기
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println();
		
		//str1 => StringBuilder 변경 후
		StringBuilder sb = new StringBuilder(str1);
		// 문자열 거꾸로 출력하는 메소드를 찾아서 실행
		System.out.println(sb.reverse());

	}

}
