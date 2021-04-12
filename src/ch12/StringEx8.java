package ch12;

public class StringEx8 {

	public static void main(String[] args) {
		String str = "12345"; // 1+2+3+4+5 = ?
		
		
		char ch1 = str.charAt(0);
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println(sum);

	}

}
