package ch5;

public class NumbersEx {

	public static void main(String[] args) {
		// 기본타입을 null로 초기화할 수 없음
		// int a = 0;
		// int b = null; =>X
		
//		int[] arr=null;
//		// 참조타입은 null로 초기화 가능
//		System.out.println(arr);
//		System.out.println(arr.length);

		int arr[]= {77,45,67,86,34,23,66,78};
		
		
		Numbers obj = new Numbers(arr);
		System.out.println("합계 : "+obj.getTotal());
		System.out.println("평균 : "+obj.getAverage());

	}

}
