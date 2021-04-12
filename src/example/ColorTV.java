package example;

import ch5.TV;

public class ColorTV extends TV {

	private int x, y;
	
	public ColorTV(int x, int y) {
		super();
		this.x=x;
		this.y=y;
		
		// TODO Auto-generated constructor stub
	}

	
	void printProperty() {
		
		System.out.printf("%d인치 %d컬러",x,y);
	}
}
