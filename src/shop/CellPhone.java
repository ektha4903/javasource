package shop;

public class CellPhone extends Product {
	
	private String carrier;

	public CellPhone(String pname, int price,String carrier) {
		super(pname, price);
		this.carrier=carrier;
		// TODO Auto-generated constructor stub
	}

	@Override
	void printExtra() {
		System.out.println("통신사 정보 : "+carrier);

	}

}
