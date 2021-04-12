package ch3;


public class IfEx1 {

	public static void main(String[] args) {
	
		int x=0;
	// if는 무조건 true여야 발동 
		//if문은 {}중괄호를 씀
		if (x==0) {
			System.out.println("x==0");
		}
		if (x!=0) {
			System.out.println("x!=0");
		}
		//조건을 검사한 후 조건에 맞지 않으면 출력 안함
		if (!(x==0)) {
			System.out.println("!(x==0)");
		}
		if (!(x!=0)) {
			System.out.println("!(x!=0)");
		}
	}

}
