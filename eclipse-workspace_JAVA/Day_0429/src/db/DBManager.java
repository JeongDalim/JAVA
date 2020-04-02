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
			// System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("����Ŭ ���� ����");
		} catch (Exception e) {
			System.out.println("����Ŭ ���� ����");
		}
		return conn;
	}
}
