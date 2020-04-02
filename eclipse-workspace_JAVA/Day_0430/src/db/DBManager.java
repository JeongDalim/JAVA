package db;

import java.sql.*;

public class DBManager {
	private DBManager() {
	}

	private static DBManager instance = new DBManager();

	public static DBManager getInstance() {

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
			// System.out.println("드라이버 접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 접속 실패");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("오라클 접속 성공");
		} catch (Exception e) {
			System.out.println("오라클 접속 실패");
		}
		return conn;
	}
}
