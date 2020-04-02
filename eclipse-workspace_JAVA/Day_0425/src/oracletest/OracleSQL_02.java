package oracletest;

import java.sql.*;

public class OracleSQL_02 {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // ����ڰ���
		String myPass = "tiger"; // ����ں��

		Connection myConn = null; // Ŀ�ؼ� ����
		Statement stmt = null; // sql�� ���� ����,��ȸ��
		// PreparedStatement pstmt = null; // sql�� ���� ����,��Ȱ�밡��
		ResultSet rs = null;// rscoreSet ����
		try {
			// ����̹� �ε�
			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			String query = "select * from dept";
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
			}
			System.out.println("����");
		} catch (Exception e) {
			System.out.println("����");
			System.out.println(e.getStackTrace());
		} finally {
			try {
				rs.close();
				stmt.close();
				myConn.close();
			} catch (Exception e) {
				System.out.println("�ý����� �����մϴ�.");
			}
		}
	}
}
