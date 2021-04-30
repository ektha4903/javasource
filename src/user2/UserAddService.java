package user2;

import java.sql.Connection;
import static user.jdbcUtil.*;
public class UserAddService {
	//비지니스 로직을 처리하는 클래스
	//DAO의 특정 메소드를 호출하는 (데이터 베이스 작업 호출) 역할
	
	public boolean add(UserVO vo) {
		boolean isAdd=false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		int result = dao.insert(vo);
		if(result>0) {
			commit(con);
			isAdd =true;
		}else {
			rollback(con);
		}
		close(con);
		return isAdd;
	}
	
}
