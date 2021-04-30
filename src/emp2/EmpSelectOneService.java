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
	public EmpVO getEmp(String ename) {
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		EmpVO vo = dao.selectOne(ename);
		
		close(con);
		
		return vo;
	}
}
