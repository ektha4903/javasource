package ch2;

public class IncreaseDereaseEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10;
int y = 10;
int z;

System.out.println("-----------------");
x++;
++x;
System.out.println("x = "+x);

System.out.println("-----------------");
y--;
--y;
System.out.println("y = "+y);

System.out.println("-----------------");
z = x++; // =(대입연산자), ++( 증감연산자) 증감연산자가 뒤에 왔기 때문에 순서가 밀림
// -> z = x;가 먼저 그 다음에 x = x+1
System.out.println("z = "+z);
System.out.println("x = "+x);

System.out.println("-----------------");
z = ++x; // =(대입연산자), ++( 증감연산자) 
// x=x+1; 먼저 그다음에 z=x;


System.out.println("z = "+z);
System.out.println("x = "+x);

System.out.println("-----------------");
z = ++x + y++; // 대입연산자(=), 산술연산자(+), 증감연산자(++)
// 증감이 1번 x=x+1; z=x+y; y=y+1
// 증감연산자가 앞에 있으면 수식 전에 적용, 뒤에 오면 수식은 따로 먼저 값을 내고 그 다음에 피연산자에만 적용
System.out.println("z = "+z);
System.out.println("x = "+x);
System.out.println("y = "+y);
	}

}
