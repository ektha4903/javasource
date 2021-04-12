package example;

public class IPTV extends ColorTV {

	int x,y;
	String ip;

	IPTV(int x, int y,String ip) {
		super(x, y);
		this.x=x;
		this.y=y;
		this.ip=ip;
		// TODO Auto-generated constructor stub
	}
	
	void printProperty() {
		System.out.printf("나의 IPTV는 %d주소의 %d인치 %d컬러",ip,x,y);
	}
	
}
