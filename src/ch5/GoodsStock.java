package ch5;

public class GoodsStock {
	// 상품 재고 관리를 위한 클래스
	// 속성 - 상품코드(p210135), 재고수량(100)
	String code;
	int quantity;
	
	
	// 생성자 - 기본생성자, 인자를 받는 생성자(상품코드만 받는/상품코드와 재고수량 받는)
	public GoodsStock() {}
	
	public GoodsStock(String code) {
		this.code=code;
	}
	public GoodsStock(String code,int quantity) {
		this.code=code;
		this.quantity=quantity;
	}
	
	// 기능 - 재고를 더한다. 재고를 뺀다.
	// 재고를 더한다(addStock) : 정수형 매개변수(재고수량),리턴 없음, 현재재고수량+=재고수량
	// 재고를 뺸다(subractStock) : 정수형 매개변수(재고수량),리턴 없음, 현재재고수량-=재고수량
	void addStock(int x) {
		quantity+=x;
	}
	void subractStock(int x) {
		if(quantity>x) {
		quantity-=x;
		}
	}
}
