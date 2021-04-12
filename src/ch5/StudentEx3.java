package ch5;

import java.util.Scanner;

public class StudentEx3 {

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
		
//		stuArr[0]=new Student();
//		stuArr[0].id="1234";
//		stuArr[0].addr="서울";
//		stuArr[0].mobile="01023456789";
//		stuArr[0].name="홍길동";
//		
//		//stuArr[1]=new Student();
//		stuArr[1].id="12345";
//		stuArr[1].addr="경기";
//		stuArr[1].mobile="01023456700";
//		stuArr[1].name="최길동";
//		
//		//stuArr[2]=new Student();
		
		
		Scanner sc = new Scanner(System.in);
		
//		for (int i=0;i<stuArr.length;i++) {
//			System.out.printf("[%d] 학생 정보 입력\n",i);
//			System.out.print("id : ");
//			stuArr[i].id=sc.nextLine();
//			System.out.print("addr : ");
//			stuArr[i].addr=sc.nextLine();
//			System.out.print("mobile : ");
//			stuArr[i].mobile=sc.nextLine();
//			System.out.print("name : ");
//			stuArr[i].name=sc.nextLine();
//			
//		}
//		//정보 확인
//		for(int i=0;i<stuArr.length;i++) {
//			System.out.printf("[%d] 학생 정보\n",i);
//			System.out.println("아이디 : "+stuArr[i].id);
//			System.out.println("주소 : "+stuArr[i].addr);
//			System.out.println("번호 : "+stuArr[i].mobile);
//			System.out.println("이름 : "+stuArr[i].name);
//		}
		int i=1;
		for (Student stu:stuArr) {
			System.out.printf("[%d] 학생 정보 입력\n",i++);
			System.out.print("id : ");
			stu.id=sc.nextLine();
			System.out.print("addr : ");
			stu.addr=sc.nextLine();
			System.out.print("mobile : ");
			stu.mobile=sc.nextLine();
			System.out.print("name : ");
			stu.name=sc.nextLine();
			
		}
		//정보 확인
		i=1;
		System.out.println();
		for(Student stu:stuArr) {
			System.out.printf("[%d] 학생 정보\n",i++);
			System.out.println("아이디 : "+stu.id);
			System.out.println("주소 : "+stu.addr);
			System.out.println("번호 : "+stu.mobile);
			System.out.println("이름 : "+stu.name);
		}

	}

}
