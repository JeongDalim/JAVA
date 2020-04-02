package dbconntest;

import java.sql.*;

public class DBConnTest {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // 사용자계정
		String myPass = "tiger"; // 사용자비번

		// JDBC 드라이버 로딩
		try {
			Class.forName(myDriver);
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		// DB연결 테스트
		Connection myConn = null;
		try {
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("Oracle 연결 성공");
			// DB연결 해제
			myConn.close();
		} catch (Exception e) {
			System.out.println("Oracle 연결 실패");
		}
	}

}
