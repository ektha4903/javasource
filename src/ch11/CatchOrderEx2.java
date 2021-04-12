package ch11;

public class CatchOrderEx2 {

	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			//NumberFormatException
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			System.out.println(op1+op2);
			//multicatch
		} catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("매개인자의 개수를 확인하거나, 숫자로 변환이 가능한지 확인해 주세요");
		} 
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		finally {
			System.out.println("무조건 수행");
		}
	}
}
