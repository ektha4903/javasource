package ch4;

import java.util.Scanner;

public class ArrayEx19 {

	public static void main(String[] args) {
		// 학생들의 점수를 받아서 최고 점수 및 평균 점수를 구하기
		
		Scanner sc = new Scanner(System.in);
		int scores[]=null;
		
		// 몇 명의 학생? => 입력
		
		System.out.print("학생 수 입력 : ");
		int student = sc.nextInt();
		scores = new int[student];
		
			for(int i=0;i<scores.length;i++) {
			System.out.print("점수 입력 >> ");
			scores[i]=sc.nextInt();
		}
		    for(int score:scores) {
			System.out.println(score);
			
		}
		
		

	}

}
