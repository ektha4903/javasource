package ch5;

/* 클래스
 * 클래스 명의 시작은 숫자가 올 수 없음 : 3Car(X)
 * $,_외의 특수문자는 사용할 수 없음 : @Car(X)
 * 자바 키워드는 시작할 수 없음 : public, class, switch, for, ....
 * 대문자로 시작(관례)
 * 서로 다른 단어가 혼합된 이름을 사용할 때는 각 단어의 첫 머리 글자는 대문자로 작성
 *  ex) ChatServer
 */

public class Student {
	//속성 - 학번, 이름, 주소, 핸드폰...  => 필드(멤버변수,프로퍼티)
	
	String id;//학번
	String name; //이름
	String addr; //주소
	String mobile; //핸드폰
	
	
	// 생성자 - 클래스명 동일
	//      - 개발자가 명시적으로 생성자를 선언하지 않으면 자동으로 컴파일러가 생성해 줌
	//public Student(){} - 기본 생성자(Default Constructor)
	
	
	
	//기능 - 핸드폰번호를 변경한다. 주소를 변경한다.  => 메소드
	void changeMobile(String change) { //void =>리턴타입 (메소드를 입력할 때 제일 앞에 오는 타입)
		this.mobile=change;
	} //void 다음에는 리턴 등 아무것도 넣지 않는다
	void changeAddr(String addr) {
		this.addr=addr;
	}
	
}
