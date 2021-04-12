package ch12;

public class PersonEx {

	public static void main(String[] args) {
		
		Person person1 = new Person("sksk", "홍길동");
		Person person2 = new Person("sksk", "홍길동");
		Person person3 = new Person("sksk", "고길동");
		
		System.out.println(person1.getClass().getName());
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		
		//toString() : 주소값 출력 ch12.Person@5aaa6d82
		// => 오버라이딩 : 멤버 변수의 값을 출력하는 용도로
		System.out.println(person1.toString());

	}

}
