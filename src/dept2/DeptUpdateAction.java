package dept2;

import java.util.Scanner;

public class DeptUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 수정할 부서에 대한 정보 받기
		ConcoleUtil util = new ConcoleUtil();
		DeptVO vo = util.updateDept(sc);
		//수정 서비스 요청
		DeptUpdateService service = new DeptUpdateService();
		boolean result = service.deptUpdate(vo.getLoc(), vo.getDeptno());
		//요청 결과 출력
		if(result) {
			util.printUpdateSuccessMessage();
		}else {
			util.printUpdateFailMessage();
		}

	}

}
