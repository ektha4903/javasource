package dept2;

import java.sql.Connection;




import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static emp.jdbcUtil.*;
public class DeptDAO {
	//Connection/select/insert/update/delete
	
	private Connection con;
	
	public DeptDAO(Connection con) {
		super();
		this.con = con;
	}
	
	public List<DeptVO> deptSelect() {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from dept_temp";
		
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return list;
		
	}
	//deptSelect end
	
	public DeptVO selectOne(int deptno) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from dept_temp where deptno=?";
		DeptVO vo = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new DeptVO();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}return vo;
		
		
	}
	
	//INSERT 담당
//	public boolean insert(int deptno,String dname,String loc) {
//		String sql = "INSERT INTO DEPT_TEMP(DEPTNO,DNAME,LOC) VALUES(?,?,?)";
//		boolean insertFlag = false;
//		
//		try {
//			con = getConnection();
//			pstmt = con.prepareStatement(sql);
//			// ? 세팅
//			pstmt.setInt(1, deptno);
//			pstmt.setString(2, dname);
//			pstmt.setString(3, loc);
//			
//			
//			//insert 성공 한 갯수 리턴
//			int result = pstmt.executeUpdate(); //결과값은 '몇 개의 행'이기 때문에 int 값으로 받는다
//			if(result>0) {
//				insertFlag = true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				pstmt.close();
//				con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			
//		}return insertFlag;
//	}//insert end
	
	public boolean insert(DeptVO vo) {
		String sql = "INSERT INTO DEPT_TEMP(DEPTNO,DNAME,LOC) VALUES(?,?,?)";
		boolean insertFlag = false;
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement(sql);
			// ? 세팅
			pstmt.setInt(1, vo.getDeptno());
			pstmt.setString(2, vo.getDname());
			pstmt.setString(3, vo.getLoc());
			
			//insert 성공 한 갯수 리턴
			int result = pstmt.executeUpdate(); //결과값은 '몇 개의 행'이기 때문에 int 값으로 받는다
			if(result>0) {
				insertFlag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			
		}return insertFlag;
	}
	
	//update 담당 - loc 변경
	public boolean update(String loc,int deptno) {
		boolean updateFlag = false;
		String sql = "update dept_temp set loc=? where deptno=?"; //필드명은 ?사용이 안된다.
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement(sql);
			//?세팅
			pstmt.setString(1, loc);
			pstmt.setInt(2, deptno);
			int result = pstmt.executeUpdate();
			if(result>0) {
				updateFlag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return updateFlag;
	}//update end
	
	public boolean delete(int deptno) {
		boolean deleteFlag = false;
		String sql = "delete from dept_temp where deptno=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			int result = pstmt.executeUpdate();
			if(result>0) {
				deleteFlag = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return deleteFlag;
	}
	
	
	
	
	
	
	
}
