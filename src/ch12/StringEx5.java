package ch12;

public class StringEx5 {

	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		String str2 = str1.replace("자바", "JAVA");
		System.out.println(str2);
		System.out.println(str1);
		
		str1 = str1.replace("JAVA", "자바");
		System.out.println(str1);
		
		String str3 = "hello";
		String str4 = "hello";
		String str5 = "Hello";
		//대소문자 구별
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str3.equalsIgnoreCase(str5));
	}
	

}
