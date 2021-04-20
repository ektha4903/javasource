package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest {
	
//	//DB와 연결을 위한 객체
//	static Connection con = null;
//	//SQL 구문 전송을 위한 객체
//	static PreparedStatement pstmt = null;
//	//SQL 처리 결과를 담은 객체
//	static ResultSet rs = null;

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
//		DBTest test = new DBTest();
		String sql = null;
		
		
		while(flag) {
			System.out.println("------------------------------------------");
			System.out.println("1.EMP | 2.DEPT | 3.SALGRADE |4.종료");
			System.out.println("------------------------------------------");
			
			System.out.print("메뉴 선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				EmpDAO empDao = new EmpDAO();
				empDao.select();
				
				break;
			case 2:
				DeptDAO dao = new DeptDAO();
				dao.deptSelect();
				
				break;
			case 3:
				GradeDAO gradeDao = new GradeDAO();
				gradeDao.select();
				break;
			case 4:
				flag=false;
				break;

			default:
				break;
			}
		}

	}
	
	//print담당
	public static void print(ResultSet rs) {
		try {
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getString("mgr")+"\t");
				System.out.print(rs.getString("hiredate")+"\t");
				System.out.print(rs.getInt("sal")+"\t");
				System.out.print(rs.getInt("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//connection 담당
	public static Connection getConnection() {
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//커넥션 시도 - 데이터베이스 연결 문자열 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
