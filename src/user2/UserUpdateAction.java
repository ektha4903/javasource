package user2;

import java.util.Scanner;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 회원 정보 입력받기
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.updateUser(sc);
		//서비스 호출
		UserUpdateService service= new UserUpdateService();
		boolean result = service.getUpdate(vo.getMobile(), vo.getAddr(), vo.getNo());
		//요청 결과 출력하기
		if(result) {
			util.printUpdateSuccessMessage();
		}else {
			util.printUpdateFailMessage();
		}
	}

}
