package ch2;

public class IncreaseDereaseEx1 {

	// 증감 연산자 : ++, -- => +1, -1
	// ++a, a++, --a, a--
	// ++a, --a : 다른 연산을 수행하기 전에 피연산자의 값을 +1 or -1 시킴
	// a++, a-- : 다른 연산을 수행한 후에 피연산자의 값을 +1 or -1 시킴
	// 조금더 편하게 쓰기 위해서
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// a = a+1; 
		
		int x =10, y=20;
		x++; // x=x+1
		y++; // y=y+1
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		++x; 
		++y;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
