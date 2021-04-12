package ch8;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}
	
	@Override// 상속관계에서만! 재정의 필요!
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명 :"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" KumhoTire 펑크 ***");
			return false;
	}

}
}