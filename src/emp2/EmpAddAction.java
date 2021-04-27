package emp2;

import java.util.Scanner;


public class EmpAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		//새로 추가할 Emp 정보 입력 받기 => ConsoleUtil
		ConsoleUtil util = new ConsoleUtil();
		EmpVO vo = util.printAddMessage(sc);
		//service 호출
		EmpInsertService insertService = new EmpInsertService();
		boolean isInsert = insertService.empInsert(vo);
		//요청 결과에 따라 출력문 작성
		if(isInsert) {
			util.printAddSuccessMessage();
		}else {
			util.printAddFailMessage();
		}
	}

}
