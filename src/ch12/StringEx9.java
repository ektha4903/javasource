package ch12;

public class StringEx9 {

	public static void main(String[] args) {
		String str1 = "aabbccAABBCCaa";
		System.out.println(str1);
		System.out.println("aa를 "+stringCount(str1, "aa")+" 개 찾았습니다.");
	}
	static int stringCount(String str1,String key) {
		//str1에서 key에 해당하는 문자열이 몇 개 있는지 리턴
		//원본 문자열에서 키에 해당하는 문자열의 위치를 찾기
		//두번 째부터 (찾은 위치 + 찾아야 할 문자열의 길이) 이후의 해당하는 문자열에서 찾기
		//index = 문자열 위치, pos = 문자열 찾기 시작 할 배열 순서, count = aa 찾았을
		int index=0,pos=0,count=0;
		while((index=str1.indexOf(key,pos))!=-1) {
			count++;
			pos = index + key.length();
		}
		return count;
	}
}
