package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx4 {

	public static void main(String[] args) {
		String arr[] = {"good","height","apple","piano","zero"};
		
		//정렬전
		for(String s:arr) {
			System.out.print(s+" ");
		}

		System.out.println();
		
		//정렬
		Arrays.sort(arr);
		
		//정렬후
		for(String s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		//내림차순
		Arrays.sort(arr,Comparator.reverseOrder());
		
		for(String s:arr) {
			System.out.print(s+" ");
		}
	}

}
