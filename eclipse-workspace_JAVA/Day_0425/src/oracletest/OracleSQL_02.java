package oracletest;

import java.sql.*;

public class OracleSQL_02 {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // 사용자계정
		String myPass = "tiger"; // 사용자비번

		Connection myConn = null; // 커넥션 정보
		Statement stmt = null; // sql문 정보 저장,일회성
		// PreparedStatement pstmt = null; // sql문 정보 저장,재활용가능
		ResultSet rs = null;// rscoreSet 정보
		try {
			// 드라이버 로딩
			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			String query = "select * from dept";
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
			}
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e.getStackTrace());
		} finally {
			try {
				rs.close();
				stmt.close();
				myConn.close();
			} catch (Exception e) {
				System.out.println("시스템을 종료합니다.");
			}
		}
	}
}
