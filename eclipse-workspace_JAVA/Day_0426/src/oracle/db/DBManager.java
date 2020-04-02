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
			// System.out.println("드라이버 연걸 성공");
		} catch (Exception e) {
			System.out.println("드라이버 연결 실패");
			System.out.println(e.getMessage());
		}
		try {
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("커넥션 연결 성공");
		} catch (Exception e) {
			System.out.println("커넥션 연결 실패");
			System.out.println(e.getMessage());
		}
		return myConn;
	}
}
