package member;

import java.util.Scanner;

public class MemberUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		//회원가입,수정,삭제 모든 작업들을 맡기기 위해 필요
		MemberConsoleUnil util = new MemberConsoleUnil();
		
		//여러 명의 회원정보 처리
		Member[] members = new Member[3];
		//members[1] = new Member(0, null, null, null, null, 0)
		
		while(run) {
		System.out.println("========회원관리 프로그램=========");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원목록보기");
		System.out.println("3. 회원정보수정");
		System.out.println("4. 회원정보삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		switch (select) {
		case 1:
			Member newMember = util.getNewmembers(sc);
			
			//배열에 담기
			for(int i=0;i<members.length;i++) {
				if(members[i]==null) {
					members[i]=newMember;
					break;
				}
			}
			//System.out.println(newMember);
			util.printAddSucessMessage(newMember);
			
			break;
		case 2:
			util.printMemberList(members);
			
			break;
		case 3:
			Member updateMember = util.getUpdateMember(sc, members);
			System.out.println(updateMember);
			if(updateMember!=null)
				util.printModifySucessMessage(updateMember);
			else
				util.printModifyFailMessage();
			break;
		case 4:
			Member deleteMember = util.removeMember(sc, members);
			if(deleteMember!=null)
				util.printRemoveSucessMessage();
			else
				util.printRemoveFailMessage();
			break;
		case 5:
			run=false;
		}
		}		

	}

}
