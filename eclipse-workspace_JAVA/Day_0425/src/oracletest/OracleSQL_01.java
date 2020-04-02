package oracletest;

import java.sql.*;

public class OracleSQL_01 {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // ����ڰ���
		String myPass = "tiger"; // ����ں��

		Connection myConn = null; // Ŀ�ؼ� ����
		Statement stmt = null; // sql�� ���� ����,��ȸ��
		String sql = "";

		try {
			// ����̹� �ε�
			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			sql = "insert into dept values(90,'ȫ�浿','����')";
			stmt = myConn.createStatement();
			int row = stmt.executeUpdate(sql); // executeUpdate()�� ����Ÿ���� 1 �Ǵ� 0 �̴�
			if (row != 0) {
				System.out.println("���� ��ϵǾ����ϴ�.");
			}
		} catch (Exception e) {
			System.out.println("����");
			System.out.println(e.getStackTrace());
		} finally {
			try {
				stmt.close();
				myConn.close();
			} catch (Exception e) {
				System.out.println("�ý����� �����մϴ�.");
			}
		}
	}
}
