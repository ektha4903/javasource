package example;

public abstract class OddDetector {
	
	int n;
	
	public OddDetector(int n) {
		super();
		this.n = n;
	}
	
	int getN() {
		return n;
	}
	
	abstract boolean isOdd();
}
