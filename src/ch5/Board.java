package ch5;

public class Board {
	// 속성 - 글번호(1,2,3...), 제목, 작성자, 내용
	int num;
	String title;
	String writer;
	String content;
	
	// 생성자 - 기본생성자, 인자를 모두 받는 생성자
	public Board() {
		super();
	}

	public Board(int num, String title, String writer, String content) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	
	
}
