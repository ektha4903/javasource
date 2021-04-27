package emp2;

import static emp.jdbcUtil.*;

import java.sql.Connection;
public class EmpSelectOneService {
	public EmpVO getEmp(int empno) {
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		EmpVO vo = dao.selectOne(empno);
		
		close(con);
		
		return vo;
	}
}
