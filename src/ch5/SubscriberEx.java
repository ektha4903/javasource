package ch5;

import java.util.Scanner;

public class SubscriberEx {

	public static void main(String[] args) {
		SubscriberInfo person1 = new SubscriberInfo();
		SubscriberInfo person2 = new SubscriberInfo("강감찬","kang","kang123");
		SubscriberInfo person3 = new SubscriberInfo("홍길동","hong","hong123","011123345","여수");
		
		//person2 비밀번호 변경
		//변경비밀번호를 넘겨주기
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 비밀번호 입력 : ");
		String changePassword=sc.nextLine();
		person2.changePwd(changePassword);
		
		
		System.out.print("등록할 전화번호 입력 : ");
		String changenum=sc.nextLine();
		person2.setTel(changenum);
		
		System.out.printf(person2.password+" "+person2.num);
		System.out.println();
		
		person3.changePwd("hong456");
		person3.setTel("0101234456");
		person3.setAddr("부산");
		
		//확인
		System.out.println("변경된 전화번호 : "+person3.num);
		System.out.println("변경된 주소 : "+person3.addr);
	}

}
