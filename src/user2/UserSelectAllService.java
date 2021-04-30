package user2;
import static user.jdbcUtil.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
public class UserSelectAllService {
	public List<UserVO> listAll(){
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		List<UserVO> list = dao.getList();
		
		close(con);
		
		return list;
	}
	
}
