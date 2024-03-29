package emp2;

import static emp.jdbcUtil.*;

import java.sql.Connection;

public class EmpUpdateService {

	public boolean empUpdate(int comm,int empno) {
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean isUpdate = false;
		
		int result = dao.update(comm, empno);
		
		//트랜잭션 처리를 위해서 Connection 객체를 서비스 클래스에 생성, 트랜잭션은 커넥션 단위로 처리
		if(result>0) {
			commit(con);
			isUpdate =true;
		} else {
			rollback(con);
		}
		
		close(con);
		
		return isUpdate;
	}
}
