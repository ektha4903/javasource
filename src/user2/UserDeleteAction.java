package user2;

import java.util.Scanner;

public class UserDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		//삭제할 회원 번호 입력받기
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.deleteUser(sc);
		
		//서비스 요청하기
		UserDeleteService service = new UserDeleteService();
		boolean result = service.deleteUser(vo.getNo());
		//요청 결과 출력하기
		if(result) {
			util.printDeleteSuccessMessage();
		}else {
			util.printDeleteFailMessage();
		}

	}

}
