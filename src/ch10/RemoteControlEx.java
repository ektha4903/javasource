package ch10;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControll remote = new Television();
		remote.turnOn();
		remote.turnOff();
		
		remote = new Audio();
		remote.turnOn();
		remote.setVolume(12);
		remote.turnOff();

		
		//익명구현
		RemoteControll rc = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("전원을 킵니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 조절 "+volume);
			}
		};
		
		rc.setMute(true);
		rc.setVolume(10);
		rc.turnOff();
	}

}
