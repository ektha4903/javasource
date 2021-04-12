package ch4;

public class ArrayEx16 {

	public static void main(String[] args) {
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50}
		};
		
		
		int result[][]=new int[score.length+1][score[0].length+1];
		int total =0;
		
		for(int i=0;i<result.length;i++) {
			
			for(int j=0;j<result[i].length;j++) {
				
				
				
				
				System.out.printf("%5d",result[i][j]);
			}
			System.out.println(score);
		}

	}

	//char[] chArr=words[i].toCharArray();

}
