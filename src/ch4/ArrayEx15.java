package ch4;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class ArrayEx15 {

	public static void main(String[] args) {
		String words[]= {"television","computer","mouse","phone"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question=words[i].toCharArray();// "abc" -> chArr[]={'a','b','c'}
			
		//문자의 위치 섞기
			for(int j=0;j<question.length;j++) {
				int pos = (int)(Math.random()*question.length);
				char temp=question[j];
				question[j]=question[pos];
				question[pos]=temp;
				
			}
			//문제 보여주기
			System.out.printf("%s의 정답을 입력하세요 >>",new String(question));
			//답변 받기
			String answer = sc.nextLine();
			
			//정답이 일치하는 지 확인
			if(words[i].equals(answer)) {
				System.out.println("정답입니다");
			}else {
				System.out.println("오답입니다");
			}
		}

	}

}
