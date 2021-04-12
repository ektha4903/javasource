package ch11;

public class UnCheckedException {

	public static void main(String[] args) {
		// UncheckedException = 런타입
		// 대표적으로 nullPointException 이 있음
		String data = null;
		System.out.println(data);
		System.out.println(data.toString()); //=> null에 .을 찍으면 나는 오류
											 //=> .으로 heap에 다가가면!

	}

}
