package ch4;

public class ReferenceEx1 {

	public static void main(String[] args) {
//		String strArr[]=new String[3];
		
		
//		//참조타입 - null할당 (힙 영역의 객체를 참조하지 않음)
//		int intArr[]=null; // 스택에만 들어가 있음
//		System.out.println(intArr.length);
//		
//		String strArr[]=null;
//		System.out.println(strArr.length);//null point access

		String strArr[]=new String[3];
		strArr[0]="홍길동";
		strArr[1]="홍길동";
		strArr[2]=new String("홍길동");
		
		//문자열은 ==(X), equals(O)
		System.out.println(strArr[0]==strArr[1]);
		System.out.println(strArr[0].equals(strArr[2]));
		
	}

}
