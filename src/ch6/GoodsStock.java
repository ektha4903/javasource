package ch6;

public class GoodsStock {
	// 상품 재고 관리를 위한 클래스
	// 속성 - 상품코드(p210135), 재고수량(100)
	private String code;
	private int quantity;
	
	
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
	
	//setter 메소드
	public void setCode(String code) {
		this.code = code;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public String getCode() {
		return code;
	}
	public int getQuantity() {
		return quantity;
	}
}
