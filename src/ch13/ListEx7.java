package ch13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx7 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(2000000);
		List<String> linkedList = new LinkedList<String>();
		
		System.out.println("==========순차적인 추가============");
		System.out.println("ArrayList : "+add1(arrayList));
		System.out.println("LinkedList : "+add1(linkedList));
		System.out.println();
		System.out.println("==========중간에 추가============");
		System.out.println("ArrayList : "+add2(arrayList));
		System.out.println("LinkedList : "+add2(linkedList));
		System.out.println();
		System.out.println("==========순차적인 삭제============");
		System.out.println("ArrayList : "+remove1(arrayList));
		System.out.println("LinkedList : "+remove1(linkedList));
		System.out.println();
		System.out.println("==========중간에서 삭제============");
		System.out.println("ArrayList : "+remove2(arrayList));
		System.out.println("LinkedList : "+remove2(linkedList));
		System.out.println();
				
	}

	private static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	private static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	private static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	private static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}

}
