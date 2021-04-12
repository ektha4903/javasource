package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayList2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Double> list1 = new ArrayList<Double>();
		System.out.println("실수 입력");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		while(token.hasMoreTokens()) {
			list1.add(Double.parseDouble(token.nextToken()));
		}
		
		double max = 0;
		for(Double v:list1) {
			if(max<v) {
				max=v;
			}
		}
		System.out.println("가장 큰 수는 "+max);
		

	}

}
