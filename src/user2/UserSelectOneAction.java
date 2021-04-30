package user2;

import java.util.Scanner;

public class UserSelectOneAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 번호 입력 받기 => console
		ConsoleUtil util = new ConsoleUtil();
		int no = util.selectOne(sc);
		//서비스 요청
		UserSelectOneService service = new UserSelectOneService();
		UserVO vo = service.getUser(no);
		//요청 결과에 따라 메세지 출력
		if(vo!=null) {
			util.printSelectOne(vo);
		}else {
			util.printSelectOneFailMessage(no);
		}

	}

}
