package ch7;

public class DmbCellPhone3 extends Cellphone2 {
	int channel;
	
	public DmbCellPhone3(String model, String color,int channel) {
		super(model, color);
		this.channel=channel;
	}
	// 기본생성자는 있었음 => public DmbCellphone3(){super();}
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번 으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
