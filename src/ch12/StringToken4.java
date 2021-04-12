package ch12;

import java.util.StringTokenizer;

public class StringToken4 {

	public static void main(String[] args) {
		String experssion = "x=100*(200+300)/2";
		// x 100 200 300 2 만 갖고 싶음
		StringTokenizer token = new StringTokenizer(experssion, "=*(+)/");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

	}

}
