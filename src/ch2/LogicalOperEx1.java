package ch2;

public class LogicalOperEx1 {
	
	//논리 연산자 : &&(and),||(or),^(xor),!(not)
	//              &,    |
	
	//true && true =>true
	//true && false => false
	
	//true || true =>true
	//true || false => true
	
	//true ^ true =>true
	//true ^ false => false
	//false ^ false => false

	public static void main(String[] args) {
		
		int charCode='A';
		if((charCode>=65) && (charCode<=90)) {
			System.out.println("대문자");
		}
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자");
		}
		int value=6;
		if((value%2==0)||(value%3==0)) {
			System.out.println("2 혹은 3의 배수");
		}
	}

}
