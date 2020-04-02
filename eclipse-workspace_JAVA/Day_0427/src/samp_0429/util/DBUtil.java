package samp_0429.util;

import java.sql.*;

public class DBUtil {
	private DBUtil() {

	}

	private static DBUtil instance = new DBUtil();

	public static DBUtil getinstance() {
		return instance;
	}

	public Connection getConnection() {
		Connection conn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "hr";
		String myPass = "1234";
		try {
			Class.forName(myDriver);
			// System.out.println("드라이버 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 접속 실패!");
			System.out.println(e.getMessage());
		}
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("로그인 성공!");
		} catch (SQLException e) {
			System.out.println("로그인 실패!");
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
