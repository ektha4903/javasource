package ch3;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("몇 단? ");
		 int dan = sc.nextInt();
		 
		 for (int i=1;i<10;i++) {
			 System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		 }
	}

}
