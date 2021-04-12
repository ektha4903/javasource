package ch6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	// set 멤버 변수 이름 : 멤버변수의 값을 변경 => setter메소드
	public void setHour(int hour) {
		if(hour<0 || hour>23) 
			return;
			this.hour = hour;
	}
	// Singleton
	public Time() {
		
	}
	
	
	// get 멤버 변수 이름 : 멤버변수의 값을 읽기 => getter 메소드 
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute>59)
			return;
			this.minute=minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		if(second<0 || second>59)
			return;
			this.second=second;
	}
	public int getSecond() {
		return second;
	}
}
