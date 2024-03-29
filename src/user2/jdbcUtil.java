package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcUtil {
	//static : 클래스 작성 완료가 되면 메모리에 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection con = null;
		try {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // java.net.UnknownHostException: loclhost
		String user = "javadb";
		String password = "12345";
		
		con = DriverManager.getConnection(url, user, password);
		//개발자가 직접 트랜잭션 제어
		con.setAutoCommit(false);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
