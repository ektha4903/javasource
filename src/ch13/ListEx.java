package ch13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// E : 리스트 안에 담아야 할 타입 => 참조타입으로 들어와야함
		//int => Integer
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//요소추가
		list1.add(1);
		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000);
		list1.add(100000);
		
		//확인
		//System.out.println(list1);
		
		for(Integer i:list1) {
			System.out.println(i);
		}

		list1.sort(Comparator.reverseOrder());
		
		for(Integer i:list1) {
			System.out.println(i);
		}
	}

}
