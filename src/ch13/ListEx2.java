package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		
		list1.add("java");
		list1.add("java");
		list1.add("jdbc");
		list1.add("oracle");
		list1.add("jsp");
		list1.add("servlet");

		System.out.println(list1);
		System.out.println("size "+list1.size()); // =>lengh랑 같은 기능
		//아이템 삭제
		list1.remove(0);
		System.out.println(list1);
		
		//아이템 찾기
		System.out.println("mybatis 위치 "+list1.indexOf("mybatis"));
		
		//특정위치의 요소 가져오기
		System.out.println("특정 요소 가져오기 : "+list1.get(1));
		
		for(String s:list1) {
			System.out.println(s);
		}
	}

}
