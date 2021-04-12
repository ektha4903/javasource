package ch5;

public class TriangleEx2 {

	public static void main(String[] args) {
		// 밑변 10, 높이 8인 삼각형 객체 생성
		Triangle tri1 = new Triangle(10, 8);
		
		//면적 구하기
		System.out.println("삼각형 면적 : "+tri1.getArea());
		
		
		//밑변 30, 높이 20인 삼각형 객체 생성
		Triangle tri2 = new Triangle(30, 20);
		//면적
		System.out.println("삼각형 면적 : "+tri2.getArea());

	}

}
