package ch6;

public class Product {
	
	// 속성 - 상품코드, 상품명, 제조사, 제조단가, 할인율
	private String pcode;
	private String pname;
	private String company;
	private int price;
	private int discount;
	
	// 생성자 - 모든 필드를 파라메터로 받는 생성자/ 할인율을 뺸 나머지 필드를 받는 생성자
	public Product(String code, String name, String company, int price, int sale) {
		super();
		this.pcode = code;
		this.pname = name;
		this.company = company;
		this.price = price;
		this.discount = sale;
	}
	
	public Product(String code, String name, String company, int price) {
		super();
		this.pcode = code;
		this.pname = name;
		this.company = company;
		this.price = price;
	}


	// 기능 - 할인율을 변경한다. 판매가를 계산한다. 제조단가 * (100-할인율)/100
	void setDiscount(int discount) {
		this.discount=discount;
	}
	public int getDiscount() {
		return discount;
	}
	
	int setPrice() {
		return price*(100-discount)/100;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
