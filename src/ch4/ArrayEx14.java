package ch4;

import javax.xml.crypto.Data;

public class ArrayEx14 {

	public static void main(String[] args) {
		String words[]= {"television","computer","mouse","phone"};
		
		for(int i=0;i<words.length;i++) {
			char[] chArr=words[i].toCharArray();// "abc" -> chArr[]={'a','b','c'}
			for(int j=0;j<chArr.length;j++) {
				System.out.print(chArr[j]+" ");
			}
			System.out.println();
		}

	}

}
