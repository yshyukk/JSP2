package co.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import co.edu.vo.MemberVO;



public class MemberDAO {

	// ORACLE DB에 대한 정보
		private String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		private String oracleUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		private String connectedId ="hr";
		private String connectedPwd ="hr";
		// 공통으로 사용되는 필드

		protected Connection conn;
		protected Statement stmt;
		protected PreparedStatement pstmt;
		protected ResultSet rs;

		// 한번만 실행시키고자 한다면 생성자 안에서 생성해도 됨
		public MemberDAO() {
			//dbConfig();
		}

		// DAO에는 DB접속,해제 메서드만 있는게 정석
		// DB접속 메서드
		public void connect() {
			try {
				Class.forName(jdbcDriver);

				conn = DriverManager.getConnection(oracleUrl, connectedId, connectedPwd);

			} catch (ClassNotFoundException e) {
				System.out.println("jdbc driver 로딩 실패");

			} catch (SQLException e) {
				System.out.println("DB 연결 실패");
			}
		}

		// DB해제 메서드
		public void disconnect() {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void insertMember(MemberVO vo) {
			String sql = "insert into test_member(id, name, passwd, address) values(?,?,?,?)";
			connect();
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,  vo.getId());
				pstmt.setString(2, vo.getName());
				pstmt.setString(3, vo.getPasswd());
				pstmt.setString(4, vo.getAddress());
				int r = pstmt.executeUpdate();
				System.out.println(r + "건 입력");
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
		}		
}
