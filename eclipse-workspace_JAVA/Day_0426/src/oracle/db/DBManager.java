package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private DBManager() {
	}

	private static DBManager instance = new DBManager();

	public static DBManager getInstance() {
		return instance;
	}

	public Connection getConnection() throws Exception {
		Connection myConn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "hr";
		String myPass = "1234";

		try {
			Class.forName(myDriver);
			// System.out.println("����̹� ���� ����");
		} catch (Exception e) {
			System.out.println("����̹� ���� ����");
			System.out.println(e.getMessage());
		}
		try {
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("Ŀ�ؼ� ���� ����");
		} catch (Exception e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			System.out.println(e.getMessage());
		}
		return myConn;
	}
}
