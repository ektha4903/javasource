package ch13;

public class Student implements Comparable<Student> {
	private String name;
	private Integer java;

	public Student(String name,Integer java) {
		super();
		this.name = name;
		this.java = java;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + java ;
	}

	@Override
	public int compareTo(Student o) { // 정렬기준
		//return o.name.compareTo(this.name); //내림차순
		//return this.name.compareTo(o.name); 오름차순
		
		//java 점수 정렬
		return this.java.compareTo(o.java);
	}
	
	
}
