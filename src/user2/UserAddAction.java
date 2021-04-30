package user2;

import java.util.Scanner;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		//새로운 사용자 정보를 입력받기 => Consoleutil
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.addUser(sc);
		//사용자 정보 추가 서비스 요청 => UserAddService
		UserAddService service = new UserAddService();
		boolean result = service.add(vo);
		//요청 결과에 따라 메세지 출력 => consoleutil
		if(result) {
			util.printAddSuccessMessage();
		}else {
			util.printAddFailMessage();
		}

	}

}
