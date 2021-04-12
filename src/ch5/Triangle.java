package ch5;

public class Triangle {
	//속성 - 밑변, 높이,
	
	int baseLine;
	int height;
	
	Triangle(int baseLine, int height){
		this.baseLine=baseLine;
		this.height=height;
		
	}
	
	
	//기능 - 면적 구하기
	double getArea(){
		return baseLine*height/2;
	} //이 메소드가 끝나고 double타입으로 리턴해야해 라는 의미
	
}
