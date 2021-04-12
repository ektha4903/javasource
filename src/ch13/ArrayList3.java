package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayList3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		System.out.println("2012~2020년 사이의 키(cm)를 1년 단위로 입력하세요 >> ");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		while(token.hasMoreTokens()) {
			list1.add(Integer.parseInt(token.nextToken()));
		}
		// 120 122 125 130 160 173 175
		// between = 21, pos = 5
		int between=0,pos=0;
		for(int i=0;i<list1.size()-1;i++) {
			int diff = list1.get(i+1) - list1.get(i);
			if(between<diff) {
				between = diff;
				pos = i;
			}
		}
		
		System.out.println("가장 키가 많이 자란 해는 "+(pos+2012)+"년, "+between+" cm");
		

	}

}
