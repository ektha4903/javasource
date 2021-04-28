package dept2;

import static emp.jdbcUtil.*;

import java.sql.Connection;
import java.util.List;

public class DeptSelectService {
	public List<DeptVO> getList(){
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		List<DeptVO> list = dao.deptSelect();
		
		close(con);
		return list;
	}
}
