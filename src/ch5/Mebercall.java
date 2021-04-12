package ch5;

public class Mebercall {
	//인스턴스 변수
	int iv=10;
	// 클래스 변수
	static int cv=20;
	
	//인스턴스 변수
	int iv2=cv;
	//클래스변수
	//static int cv2=iv;
	
	//Membercall call = new Mebercall();
	//call.iv
	static int cv2=new Mebercall().iv;
	
	// 클래스 메솓
	static void staticMethod1() {
		System.out.println(cv);
	}
		//System.out.println(iv); => 인스턴스니까 불가능 static은 static만 가능
		
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1();
	}
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
