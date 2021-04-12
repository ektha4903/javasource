package ch5;

public class Product {
	
	// 속성 - 상품코드, 상품명, 제조사, 제조단가, 할인율
	String code;
	String name;
	String company;
	int price;
	int sale;
	
	// 생성자 - 모든 필드를 파라메터로 받는 생성자/ 할인율을 뺸 나머지 필드를 받는 생성자
	public Product(String code, String name, String company, int price, int sale) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		this.sale = sale;
	}
	
	public Product(String code, String name, String company, int price) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
	}


	// 기능 - 할인율을 변경한다. 판매가를 계산한다. 제조단가 * (100-할인율)/100
	void changeSale(int newSale) {
		this.sale=newSale;
	}
	int calPrice() {
		return price*(100-sale)/100;
	}
	
	
}
