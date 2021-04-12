package ch12;

public class StringEx3 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		//indexOf() : 매개변수로 주어진 문자열이 시작되는 인덱스 리턴
		System.out.println(str1.indexOf("자바")); //0 =>시작위치
		System.out.println(str1.indexOf("베이직")); //-1 =>못 찾으면 -1
		System.out.println(str1.indexOf("그")); //5 
		System.out.println("---------------------------------------------");
		
		String str2 = "Hello";
		System.out.println("o 문자 위치 : " +str2.indexOf('o'));
		System.out.println("el 문자 위치 : " +str2.indexOf("el",0));
		System.out.println("---------------------------------------------");
		
		String str3 = "HelloHelloHello World";
		System.out.println("l 문자 위치 : "+str3.indexOf('l'));//2
		System.out.println("l 문자 위치 : "+str3.lastIndexOf('l'));//19
		
		System.out.println("---------------------------------------------");
		
		//프
		if(str1.indexOf("프")<0) {
			System.out.println("'프'가 존재하지 않음");
		}else {
			System.out.println("'프'가 존재함");
		}
	}

}
