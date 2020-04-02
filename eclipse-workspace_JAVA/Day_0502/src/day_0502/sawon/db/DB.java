package day_0502.sawon.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	Connection conn = null;

	public Connection getConnection() {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "hr";
		String myPass = "1234";
		try {
			Class.forName(myDriver);
			// System.out.println("드라이버 접속 성공");
		} catch (ClassNotFoundException e) {
			e.getStackTrace();
			System.err.println("드라이버 접속 실패");
		}
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("로그인 성공");
		} catch (SQLException e) {
			e.getStackTrace();
			System.err.println("로그인 실패");
		}
		return conn;
	}
}
