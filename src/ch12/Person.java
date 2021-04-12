package ch12;

public class Person {
	private String id;
	private String name;
	
	
	//인자를 받은 생성자
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//equals 재정의
	//id와 name이 같다면 true 넘기기
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		
		if(this.id.equals(person.id) && this.name.equals(person.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return "Perosn [id = "+id+", name = "+name+"]";
	}
	
}
