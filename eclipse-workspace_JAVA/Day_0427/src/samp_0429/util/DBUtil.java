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
			// System.out.println("����̹� ���� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����!");
			System.out.println(e.getMessage());
		}
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("�α��� ����!");
		} catch (SQLException e) {
			System.out.println("�α��� ����!");
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
