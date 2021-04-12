package ch4;

public class ArrayEx12 {

	public static void main(String[] args) {
		int oldArray[]= {10,20,30};
		
		int newArray[]=new int[5];
		
		//oldArray => newArray로 copy
		//(Object src, int srcPos, Object dest, int destPos, int length)
		// (원본 배열, 원본배열의 0번부터, 목적지-어디로 갈거냐, 뉴 배열의 0번부터, 원본배열의 길이만큼)
		
		System.arraycopy(oldArray, 0, newArray, 1, oldArray.length);
		
		
		for(int i:newArray) {
			System.out.print(i+"\t");
		}

	}

}
