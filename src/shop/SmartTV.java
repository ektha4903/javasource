package shop;

public class SmartTV extends Product {

	private String resolution;
	
	public SmartTV(String pname, int price, String resolution) {
		super(pname, price);
		this.resolution=resolution;
		// TODO Auto-generated constructor stub
	}

	@Override
	void printExtra() {
		System.out.println("해상도 : "+resolution);

	}

}
