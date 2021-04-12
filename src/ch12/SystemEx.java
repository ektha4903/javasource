package ch12;

public class SystemEx {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.print(i+"\t");
			
			if(i==5)
				System.exit(0); //0: 정상종료, 0이 아닌 경우 : 비정상 종료
		}
	}

}
