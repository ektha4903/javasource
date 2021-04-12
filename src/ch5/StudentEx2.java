package ch5;

public class StudentEx2 {

	public static void main(String[] args) {
		// 객체 배열 => List
		Student student1= new Student();
		student1.id="1234";
		student1.addr="서울";
		student1.mobile="01023456789";
		student1.name="홍길동";
		
		Student student2= new Student();
		student2.id="12345";
		student2.addr="경기";
		student2.mobile="01023456700";
		student2.name="최길동";
		
		Student student3= new Student();
		student3.id="12346";
		student3.addr="부산";
		student3.mobile="01023456711";
		student3.name="김길동";
		
		//개선
		Student stuArr[]=new Student[3]; //=> 공간마련
		for(int i=0;i<stuArr.length;i++) {
			stuArr[i]=new Student();
		}
		
		stuArr[0]=new Student();
		stuArr[0].id="1234";
		stuArr[0].addr="서울";
		stuArr[0].mobile="01023456789";
		stuArr[0].name="홍길동";
		
		//stuArr[1]=new Student();
		stuArr[1].id="12345";
		stuArr[1].addr="경기";
		stuArr[1].mobile="01023456700";
		stuArr[1].name="최길동";
		
		//stuArr[2]=new Student();
		
		

	}

}
