package ch10;

public class ActionExample {

	public static void main(String[] args) {

		Action ac = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다");
				
			}
		};
		ac.work();

	}

}
