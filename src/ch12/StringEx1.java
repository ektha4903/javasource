package ch12;

public class StringEx1 {

	public static void main(String[] args) {
		// 문자열 객체 생성
		String str = "HELLO";
		
		System.out.println(str.charAt(0));
		
		char ch1 = str.charAt(2);
		System.out.println(ch1);
		System.out.println("문자열 길이 : "+str.length());
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			
		}
		
		char ch[] = {'H','E','L','L','O'};
		String str2 = new String(ch);
		
		System.out.println(str);
		System.out.println(str2);

	}

}
