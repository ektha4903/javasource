package ch5;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {
		// 외부에서 new 연산자로 생성자 호출 불가 (private)	
	}
	
	static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
