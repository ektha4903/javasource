package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx7 {

	public static void main(String[] args) {
		Character arr[] = {'a','q','c','r','z','o','h','f','g','s'};
		
		//정렬전
		for(char ch:arr) {
			System.out.print(ch+" ");
		}

		System.out.println();
		
		//내림정렬
		Arrays.sort(arr,Comparator.reverseOrder());
		
		//정렬후
		for(char ch:arr) {
			System.out.print(ch+" ");
		}

	}

}
