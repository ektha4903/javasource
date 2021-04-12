package ch5;

public class MiniCalc {
	int plus(int x, int y) {
		return x+y; //=> 4번 17
	}
	
	double avg(int x, int y) {//=> x=7,y=9)
		double sum=plus(x,y); //=> 3번 plus(x,y)  / 5번 sum=17
		return sum/2; //=> 6번 17/2
	}
	
	void execute() { //=> 1번
		double result = avg(7,9); //=> 2번 avg(7,9)  / 7번 result=8.5
		println("실행 결과 : "+result); //=> 8번
	}
	
	void println(String message) { //=> 8번
		System.out.println(message); //=> 9번
	}
}
