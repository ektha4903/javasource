package dept2;

import java.util.Scanner;

public class DeptDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 삭제할 부서 정보 입력받기
		ConcoleUtil util = new ConcoleUtil();
		DeptVO vo = util.deleteDept(sc);
		//삭제 서비스 요청
		DeptDeleteService service = new DeptDeleteService();
		boolean result = service.deptDelete(vo.getDeptno());
		//요청 결과 출력
		if(result) {
			util.printDeleteSuccessMessage();
		}else {
			util.printDeleteFailMessage();
		}

	}

}
