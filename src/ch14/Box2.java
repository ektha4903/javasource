package ch14;

//Box1 클래스를 Generics 적용 후

//Generics : 다양한 타입의 갹체를 다루는 메소드나 컬렉션 클래스에 컴파일 시 타입 체크해줌
//			 타입 안정성/타입 체크와 형변환을 생략할 수 있으므로 코드가 간결해짐

//T : Type의 약자 / E : Element / K : Key / V : Value


public class Box2<T> {
	//기본타입
	//참조타입 => Account, Car ..., Integer, Float
	//부모 = 자식 Object item = 자식
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
