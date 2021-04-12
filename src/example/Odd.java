package example;

public class Odd extends OddDetector {
	
	public Odd(int n) {
		super(n);
		this.n=n;
	}
	
	@Override
	boolean isOdd() {
		if(getN()%2==1) {
			return true;
		}
		return false;
	} 
		
 
}
