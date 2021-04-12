package ch10;


public class MyAdder implements AdderInterface {


	
	@Override
	public int plus(int x, int y) {
		return x+y;
	
	}

	@Override
	public int sum(int n) {
		int sum = 0 ;
		if(n>0) {
			for(int i=0;i<=n;i++) {
				sum += i;
			}
		}return sum;

	}


	}

