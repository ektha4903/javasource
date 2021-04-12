package ch2;

public class StringConcatEx2 {

	public static void main(String[] args) {
		
		//문자 => 'c'
		//문자열 => "ac"
		//문자열과 만나는 +는 연결의 의미 
		// 숫자를 만나면 연산부호
		
		String str1= "JDK"+11.0;
		String str2 = str1 + "특징";
		
		System.out.println(str2);
		
		String str3 = "JDK"+3+3.0;
		String str4 = 3+3.0+"JDK";
		
		System.out.println(str3);
		System.out.println(str4);

	}

}
