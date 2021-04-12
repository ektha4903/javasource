package ch12;

public class StringEx2 {

	public static void main(String[] args) {
		
		String str1 = "자바 프로그래밍";
		
		//문자열에 '프'가 있는지 확인하기
		char cha1 = str1.charAt(0);
		
		boolean flag=false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='프') {
				flag=true;
				break;
			}
		}
		
		System.out.println(flag?"들어있음":"없음");
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='프') {
				System.out.printf("'프'가 %d번 째에 있습니다.",i);
			}
			
		}
	}

}
