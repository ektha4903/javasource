package shop;

public abstract class Product {
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	void printDetail() {
		//기본 정보인 상품 이름과 가격을 출력한다.
		System.out.println("상품이름 : "+pname);
		System.out.println("상품가격 : "+price);
		//상세 정보를 출력하려고 printExtra() 메소드 호출
		printExtra();
	}
	abstract void printExtra();
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
