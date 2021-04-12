package member;

import java.util.Scanner;

public class MemberConsoleUnil {

	public MemberConsoleUnil() {
		super();
		// TODO Auto-generated constructor stub
	}
	Member getNewmembers(Scanner sc) {
		//사용자로부터 회원 정보를 입력 받은 후 입력받은 회원을 리턴
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("아이디 : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("국가 : ");
		String nation = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		//6개의 데이터를 한개의 객체로 만들기 => 객체(Member) 생성하고 값 담기
		
		return new Member(id,name,addr,email,nation,age);}
	
	void printAddSucessMessage(Member newMember) {
		System.out.println(newMember.getName()+" 회원 정보 추가 성공");
	}
	void printModifySucessMessage(Member updateMember) {
		System.out.println(updateMember.getName()+" 회원 정보 수정 성공");
	}
	void printModifyFailMessage() {
		System.out.println("회원 정보 수정 실패");
	}
	void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제 실패");
	}
	void printRemoveSucessMessage() {
		System.out.println("회원 정보 수정 성공");
	}
	void printMemberList(Member[] members) {
		//배열 출력
		for(Member member:members) {
			if(member!=null) {
				System.out.println("회원아이디\t  이름\t  주소\t    이메일\t\t국가\t나이");
				System.out.printf("%5d %5s %8s %13s %6s %8d\n",member.getId(),member.getName(),member.getAddr(),member.getEmail(),member.getNation(),member.getAge());
			}
		}
	}
	Member getUpdateMember(Scanner sc, Member[] members) {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 회원의 주소를 입력하세요 : ");
		String addr = sc.nextLine();
		System.out.print("수정할 회원의 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		//수정 => 회원 아이디가 같은 member 찾기
		//    => 주소, 이메일 => setter메소드 이용
			for(Member member:members) {
				if(member.getId()==id) {
					member.setAddr(addr);
					member.setEmail(email);
					return member;
				}
				}
		//수정된 Member리턴
		return null;
	}
	Member removeMember(Scanner sc, Member[] members) {
		
		//동일한 아이디를 찾아서 삭제
		System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("정말로 삭제하시겠습니까? 예(1) 아니오(2)");
		int select = Integer.parseInt(sc.nextLine());
		
		Member deleteMember =null;
		if(select==1) {
			for(int i=0;i<members.length;i++) {
				if(members[i].getId()==id) {
					deleteMember = members[i];
					members[i]=null;
					return deleteMember;
				}
			}
		}
		return null;
	}
	
	
	
}
