package ch5;

public class Circle {
	// 속성 : 반지름
	
	double r;
	
	// 생성자
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	
	// 기능 : 면적을 구한다(리턴 타입 double)
	
	double getArea() {
		return 3.14*r*r;
	}

	
}
