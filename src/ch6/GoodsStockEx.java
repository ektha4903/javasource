package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		//객체 생성2
		GoodsStock goods1=new GoodsStock();
		System.out.println(goods1);
		
		// 메소드 호출 - 재고수량 추가
		goods1.setCode("3333323");
		goods1.setQuantity(33);
		
		goods1.addStock(20);
		
		// 재고수량 확인
		System.out.println(goods1.getCode()+"재고수량 : "+goods1.getQuantity());
		
		// 메소드 호출 - 재고수량 감소
		goods1.subractStock(40);
		
		// 재고수량 확인
		System.out.println(goods1.getCode()+"재고수량 : "+goods1.getQuantity());
		
		
	}

}
