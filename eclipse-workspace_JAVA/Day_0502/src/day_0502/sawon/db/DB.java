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
			// System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			e.getStackTrace();
			System.err.println("����̹� ���� ����");
		}
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("�α��� ����");
		} catch (SQLException e) {
			e.getStackTrace();
			System.err.println("�α��� ����");
		}
		return conn;
	}
}
