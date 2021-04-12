package ch2;

public class ArithmeticOperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println("rusult1 = "+result1);
		
		int result2 = v1-v2;
		System.out.println("rusult2 = "+result2);
		
		int result3 = v1*v2;
		System.out.println("rusult3 = "+result3);
		
		int result4 = v1/v2; //나누기는 소수점은 안나오고 몫만 나옴
		System.out.println("rusult4 = "+result4);
		
		int result5 = v1%v2; // %는 나누기하고 나온 나머지 ( 몫은 안나옴 )
		System.out.println("rusult5 = "+result5);
		
		double result6 = v1/v2; 
				System.out.println("rusult6 = "+result6);
				
		double result7 = (double)v1/v2;
		System.out.println("rusult7 = "+result7);
		// double로 바꾸면서 5가 5.0으로 바뀌고 나누기 때문에 2.5로 나온다
	}

}
