package user;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static user.jdbcUtil.*;

public class UserDAO {
	
	private Connection con;
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}

	//select => 하나의 레코드를 가져오기
	//select * from userTBL where no=1  =>값이 하나만 나오면 리턴타입은 무조건 만들어 놓은 VO
	public UserVO selectOne(int no) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from userTBL where no=?";
		UserVO vo = null;
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthyear(rs.getInt("birthyear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
			}		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {			
			close(pstmt);
			close(rs);			
		}
		return vo;
		
	}
	//select => 전체의 레코드 가져오기
	//select * from userTBL;   => 여러개의 값이 나오면 무조건 list<-VO>으로 리턴 (select * from userTBL where username like ~~ 같은 문도 가능)
	public List<UserVO> getList(){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from userTBL";
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
			con = getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthyear(rs.getInt("birthyear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
				close(rs);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	//DML => RETURN타입 INT (한개 한개 성공이니까)
	
	
	//update : 전화번호, 주소 변경
	//update userTBL set mobile=?, addr=? where no=?(where절에는 pk애들이 대체로 들어옴 => 구별해야함(중복이 안되는)
	public int update(String mobile, String addr, int no) {
		int result = 0;
		String sql = "update userTBL set mobile=?, addr=? where no=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			pstmt.setString(2, addr);
			pstmt.setInt(3, no);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	//delete : no값을 받아서 처리
	public int delete(int no) {
		PreparedStatement pstmt = null;
		String sql = "delete from userTBL where no=?";
		int result = 0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	//insert
	//insert into userTBL(no,userName,birthyear,addr,mobile) values(user_seq.nextval,?,?,?,?)
	public int insert(UserVO vo) {
		PreparedStatement pstmt = null;
		String sql ="insert into userTBL(no,userName,birthyear,addr,mobile) values(user_seq.nextval,?,?,?,?)";
		int result = 0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getUsername());
			pstmt.setInt(2, vo.getBirthyear());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getMobile());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
}
