package ch4;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] iArr1=new int[10];
		int[] iArr2=new int[] {1,2,3,4,5};
		int iArr3[]= {100,25,35,65,95};
		char chArr[]= {'a','b','c','d','e'};
		double dArr[]= {35,5,38.5,57};
		boolean bArr[]= {true,false,false,true};
		
		System.out.println(iArr1); //=>I@7d6f77cc 주소가 나옴
		
		for(int arr:iArr3) {
			System.out.println(arr);
		}
		for (char ch:chArr) {
			System.out.print(ch+"\t");
		}

	}

}
