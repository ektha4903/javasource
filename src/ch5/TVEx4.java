package ch5;

public class TVEx4 {

	public static void main(String[] args) {
		// 배열 - 타입 배열명[] = new 타입[];
		// 초기화 - 배열명[0]=78;
		
		int arr[]=new int[5];
		arr[0]=78;
		
		int arr2[]= {78,88,98};
		
		TV tvarr[]=new TV[5];
		
//		tvarr[0]=new TV();
//		tvarr[1]=new TV();
//		tvarr[2]=new TV();
//		tvarr[3]=new TV();
//		tvarr[4]=new TV();
		
		for(int i=0;i<tvarr.length;i++) {
			tvarr[i]=new TV();
			tvarr[i].channel=i+10;
		}
		
		for(int i=0;i<tvarr.length;i++) {
			System.out.printf("tvarr[%d].channel = %d\n",i,tvarr[i].channel);
		}

	}

}
