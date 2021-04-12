package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {

		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member("hing12", "hing123"));
		members.add(new Member("king12", "king123"));
		members.add(new Member("cing12", "cing123"));
		members.add(new Member("sing12", "sing123"));
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
