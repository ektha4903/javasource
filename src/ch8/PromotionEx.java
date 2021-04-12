package ch8;

public class PromotionEx {

	public static void main(String[] args) {
		
		//자동 타입 변환이 일어난다(에러 안남) - 반드시 상속 관계에 있어야 함.
		A obj1 = new B();
		A obj2 = new C();
		A obj3 = new D();
		A obj4 = new E();
		
		//Type mismatch: cannot convert from E to B
		//B obj5 = new E();

	}

}
