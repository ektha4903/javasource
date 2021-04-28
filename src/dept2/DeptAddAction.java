package dept2;

import java.util.Scanner;

public class DeptAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		//새로운 부서에 대한 정보를 입력받기
		ConcoleUtil util = new ConcoleUtil();
		DeptVO vo = util.addDept(sc);
		//새 부서 추가를 위한 서비스 요청
		DeptInsertService service = new DeptInsertService();
		boolean result = service.deptInsert(vo);
		//요청 결과에 따라 적절한 메세지 출력
		if(result) {
			util.printInsertSuccessMessage();
		}else {
			util.printInsertFailMessage();
		}
	}

}
