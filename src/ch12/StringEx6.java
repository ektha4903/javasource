package ch12;

public class StringEx6 {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
	//substring(시작위치, 끝나는 위치) : 문자열 추출 (원하는 부분만 잘라내기)
		System.out.println(ssn.substring(0, 6)); 
		System.out.println(ssn.substring(7)); 
		
		//int => string 으로 바꿀 때 가장 간단한 방법은 10+""
		//				: String.valueOf(10)도 쓰인다
		System.out.println(String.valueOf(false)); //"false"
		System.out.println(String.valueOf(10.5)); // "10.5"
		System.out.println(String.valueOf(12)); // "12"
		System.out.println(String.valueOf('c')); // "c"
		
		
		String str1 = String.join("-", "Java", "is", "cool");
	    System.out.println(str1);
	     
	     
	    String str2 = "aaa"; //97
	    String str3 = "bbb"; //98
	    String str4 = "ccc"; //99
	    
	    //compareTo() : 사전순서로 비교
	    System.out.println(str2.compareTo(str3)); //-1
	    System.out.println(str3.compareTo(str2)); // 1
	    
	    System.out.println(str2.compareTo(str4)); //-2
	    
	    
	    //tpUpperCase() => 소문자를 대문자로, toLowerCase() => 대문자를 소문자로
	    String str5 = "ascdefg";
	    System.out.println(str5.toUpperCase());
	    
	    String str6 = "ABCDEFG";
	    System.out.println(str6.toLowerCase());
	    
	    
	    //trim() => 좌우 공백 제거
	    String str7 = "    ABC    deFG    ";
	    System.out.println(str7);
	    System.out.println(str7.trim()); // "    abc".equals("abc") => 원래는 false
	    								 // "    abc".trim().equals("abc") => true (이럴때 쓰임)
	    
	    
	}

}
