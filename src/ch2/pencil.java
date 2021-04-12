package ch2;

public class pencil {

	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
		//학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지 출력하시오
		//변수명은 임의로 설정 가능
		
		int x = 534;
		int y = 30;
		
		int z = x/y;
		int q = x%y;
		
		System.out.println("연필 = "+z);
		System.out.println("나머지 = "+q);

	}

}
