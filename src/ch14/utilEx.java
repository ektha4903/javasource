package ch14;

public class utilEx {

	public static void main(String[] args) {
		
		Box2<String> box2 = Util.boxing("홍길동");
		System.out.println(box2.getItem());
		
		Box2<Integer> box3 = Util.boxing(100);
		System.out.println(box3.getItem());
	}

}
