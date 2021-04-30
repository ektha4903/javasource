package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;
import static emp.jdbcUtil.*;
public class EmpDAO {
	
	private Connection con;
	EmpDAO(Connection con) {
		this.con=con;
	}
	

	
	public List<EmpVO> select() {
		
		String sql = "select * from emp_temp";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//ArrayList 객체 생성
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDeptno(rs.getInt("deptno"));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	//select end
	
	public EmpVO selectOne(int empno) {
		String sql = "select * from emp_temp where empno=?";
		String sql2 = "select * from emp_temp where ename like '%?%'";
		EmpVO vo = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno); //? 세팅 => 
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDeptno(rs.getInt("deptno"));
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}//selectOne end
	
//	public int insert(int empno,String ename,String job,int mgr,int sal,int comm,int deptno) {
//		int result=0;
//		try {
//			con = getConnection();
//			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
//			sql += "values(?,?,?,?,sysdate,?,?,?)";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, empno);
//			pstmt.setString(2, ename);
//			pstmt.setString(3, job);
//			pstmt.setInt(4, mgr);
//			pstmt.setInt(5, sal);
//			pstmt.setInt(6, comm);
//			pstmt.setInt(7, deptno);
//			result = pstmt.executeUpdate();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				pstmt.close();
//				con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		return result;
//	}//insert end
	
	public int insert(EmpVO vo) {
		int result=0;
		PreparedStatement pstmt = null;

		try {
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
			sql += "values(?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getMgr());
			pstmt.setInt(5, vo.getSal());
			pstmt.setInt(6, vo.getComm());
			pstmt.setInt(7, vo.getDeptno());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		return result;
	}//insert end
	
	
	public int update(int comm, int empno) {
		//update emp_temp set comm=? where empno=?
		int result=0;
		PreparedStatement pstmt = null;
		
		String sql = "update emp_temp set comm=? where empno=?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, empno);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		return result;
	}//update end
	
	public int delete(int empno, String ename) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "delete from emp_temp where empno=? and ename=?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		return result;
	}


public EmpVO selectOne(String ename) {
	String sql = "select * from emp_temp where ename like ?'";
	EmpVO vo = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "%"+ename+"%"); //? 세팅 => 
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			vo = new EmpVO();
			vo.setEmpno(rs.getInt("empno"));
			vo.setEname(rs.getString("ename"));
			vo.setJob(rs.getString("job"));
			vo.setMgr(rs.getInt("mgr"));
			vo.setHiredate(rs.getDate("hiredate"));
			vo.setSal(rs.getInt("sal"));
			vo.setComm(rs.getInt("comm"));
			vo.setDeptno(rs.getInt("deptno"));
	
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		close(rs);
		close(pstmt);
	}
	return vo;
}
}
//selectOne end
