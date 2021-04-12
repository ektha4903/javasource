package ch12;

public class Value {
	int value;
	
	public Value(int value) {
		this.value =value;
	}
	@Override
	public boolean equals(Object obj) {
		Value v = (Value) obj;
		if(this.value == v.value) {
			return true;
		}
		return true;
	}
	
	@Override
	public String toString() {
		// String 형태로 변경 => 문자열로 만든다 (빈 문자열 " "도 가능)
		return "value = "+value; //value는 int값이기 때문에 그냥 value만 리턴하면 오류남
	}
}
