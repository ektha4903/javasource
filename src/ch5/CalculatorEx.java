package ch5;

public class CalculatorEx {

	public static void main(String[] args) {
		//객체 생성 => 기본 생성자가 호출
		Calculator cal= new Calculator();
		
		//메소드 호출
		cal.powerOn(); // void일 때는 호출만 하면 끝
		
		//System.out.println(cal.plus(35, 45)); 
		int result = cal.plus(35, 45); // 변수에 받기 (새 변수 타입은 그 메소드의 타입에 맞춰서!)
		System.out.println(result);
		
		
		double result2 = cal.divide(10, 4);
		System.out.println(result2);
		
	}

}
