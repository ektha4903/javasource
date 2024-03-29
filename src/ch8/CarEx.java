package ch8;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 Hankooktire 로 교체");
				car.frontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 Kumhotire 로 교체");
				car.frontRightTire = new KumhoTire(13, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 Kumhotire 로 교체");
				car.backLeftTire = new KumhoTire(14, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 Hankooktire 로 교체");
				car.backRightTire = new HankookTire(17, "뒤오른쪽");
				break;
			}
			System.out.println("------------------------------------------------");
		}
		
		
		car.run();

	}

}
