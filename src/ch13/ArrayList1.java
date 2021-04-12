package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) >>");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		
		while(token.hasMoreTokens()) {
			list1.add(token.nextToken());
		}
		String grade = null;
		for(String g:list1) {
			switch (g) {
			case "A":
				grade = "4.0";
				break;
			case "B":
				grade = "3.0";
				break;
			case "C":
				grade = "2.0";
				break;
			case "D":
				grade = "1.0";
				break;
			case "F":
				grade = "0.0";
				break;
			}
			System.out.println(grade+"\t");
		}

	}

}
