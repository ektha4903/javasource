package ch5;

public class SubscriberInfo {
	// 가입자 정보 클래스
	// 속성 - 이름(홍길동), 아이디(hong123), 패스워드(hing@@!@), 전화번호(0`01223344), 주소(서울)
	String name;
	String id;
	String password;
	String num;
	String addr;
	
	//기본생성자
	public SubscriberInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//이름, 아이디, 패스워드만 초기화하는 생성자
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	//전체 속성을 초기화하는 생성자
	public SubscriberInfo(String name, String id, String password, String num, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.num = num;
		this.addr = addr;
	}
	
	
	//기능 - 비밀번호 변경/ 전화번호 등록/ 주소등록
	// 비밀번호 변경(changePwd) - 변경할 비밀번호 매개변수 받기, 리턴타입 없음
	void changePwd(String password) {
		this.password=password;
	}
	// 전화번호 등록(setTel) - 등록할 전화번호 매개변수 받기, 리턴타입 없음
	void setTel(String num) {
		this.num=num;
	}
	// 주소 등록(setAddr) - 등록할 주소 매개변수 받기, 리턴타입 없음
	void setAddr(String addr) {
		this.addr=addr;
	}
	
}
