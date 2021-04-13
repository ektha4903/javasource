package ch14;

public class BoxEx2 {

	public static void main(String[] args) {
		Box2<String> box = new Box2<String>(); //=오른쪽은 <>안에 아무것도 안 넣어도 가능함.
		
		box.setItem("홍길동"); //box.setItem(new String("홍길동"))
		System.out.println(box.getItem()); //String obj = (String)box.getItem();
		
//		box.setItem(33);
//		System.out.println(box.getItem()); //Integer obj = (Integer)box.getItem();
//		
//		box.setItem(33.14f);
//		System.out.println(box.getItem());
//		
//		box.setItem(true);
//		System.out.println(box.getItem());
		
		

	}

}
