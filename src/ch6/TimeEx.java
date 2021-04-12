package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 25;
		t.setHour(12);
		t.setMinute(25);
		t.setSecond(61);
		
		System.out.printf("현재 시간 = %d : %d : %d\n",t.getHour(),t.getMinute(),t.getSecond());
	}

}
