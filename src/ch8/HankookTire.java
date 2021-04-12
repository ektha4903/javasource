package ch8;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}
	
	@Override// 상속관계에서만! 재정의 필요!
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명 :"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" HankkokTire 펑크 ***");
			return false;
	}

}
}