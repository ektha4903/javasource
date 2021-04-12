package ch5;

import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		// Board 객체 배열 3개
		// 게시글 입력받기
		// 출력까지
		
		Board boArr[]=new Board[3];
		for(int i=0;i<boArr.length;i++) {
			boArr[i]=new Board();
		}
		
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		for(Board bo:boArr) {
			System.out.printf("[%d] 게시글 정보 입력\n",i++);
			System.out.print("제목 : ");
			bo.title=sc.nextLine();
			System.out.print("작성자 : ");
			bo.writer=sc.nextLine();
			System.out.print("내용 : ");
			bo.content=sc.nextLine();
		}
		System.out.println();
		
		i=1;
		for(Board bo:boArr) {
			System.out.printf("글 번호 : [%d]\n",i++);
			System.out.println("제목 : "+bo.title);
			System.out.println("작성자 : "+bo.writer);
			System.out.println("내용 : "+bo.content);
			System.out.println();
		}

	}

}
