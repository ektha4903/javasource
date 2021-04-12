package ch10;

/* 인터페이스
 * 추상 클래스와 비슷함 
 * 추상 클래스보다 추상화가 더 높음 => 추상 메소드와 상수만을 가질 수 있음.
 * 다른 클래스를 작성하는데 도움을 주는 목적으로 사용됨(뼈대만 사용)
 * 
 * 모든 메소드는 public abstract 이어야 하며 생략가능
 * 모든 멤버변수는 public static final이어야 하며 생략 가능
 * 생성자 없음
 * 
 * JDK8 버전부터 인터페이스 변화
 * 디폴트 메소드/정적 메소드
 * 
 * JDK9 인터페이스 변화
 * private 메소드
 */

public interface Account {
	final static int SPADE = 4;
	
	
	//Account(){} 
	
	
	
	
	
	void test(); // = abstract void test();
	void print();
	default int method2() {
		return 0;
	}
	static void method1() {
		
	}
}
