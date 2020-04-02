package dbconntest;

import java.sql.*;

public class DBConnTest {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // ����ڰ���
		String myPass = "tiger"; // ����ں��

		// JDBC ����̹� �ε�
		try {
			Class.forName(myDriver);
			System.out.println("����̹� �ε� ����");
		} catch (Exception e) {
			System.out.println("����̹� �ε� ����");
		}
		// DB���� �׽�Ʈ
		Connection myConn = null;
		try {
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("Oracle ���� ����");
			// DB���� ����
			myConn.close();
		} catch (Exception e) {
			System.out.println("Oracle ���� ����");
		}
	}

}
