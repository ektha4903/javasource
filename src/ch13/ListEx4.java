package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {

	public static void main(String[] args) {
		Member member1 = new Member("hing12", "hing123");
		Member member2 = new Member("king12", "king123");
		Member member3 = new Member("cing12", "cing123");
		Member member4 = new Member("sing12", "sing123");
		
		List<Member> members = new ArrayList<Member>();
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		System.out.println(members);
		
		for(int i=0;i<members.size();i++) {
			Member member = members.get(i);
			System.out.println("아이디 : "+member.getId());
			System.out.println("비밀번호 : "+member.getPassword());
			System.out.println();
		}
		
		//향상된 for문
		for(Member member:members) {
			System.out.println("아이디 : "+member.getId());
			System.out.println("비밀번호 : "+member.getPassword());
			System.out.println();
		}

	}

}
