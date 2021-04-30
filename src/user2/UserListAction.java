package user2;

import java.util.List;
import java.util.Scanner;

public class UserListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 서비스 호출
		UserSelectAllService service = new UserSelectAllService();
		List<UserVO> list = service.listAll();
		//리스트 출력
		ConsoleUtil util = new ConsoleUtil();
		if(!list.isEmpty()) {
			util.printListAll(list);
		}else {
			util.printListFailMessage();
		}

	}

}
