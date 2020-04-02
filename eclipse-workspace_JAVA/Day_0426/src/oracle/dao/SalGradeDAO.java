package oracle.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.db.DBManager;

public class SalGradeDAO {
	DBManager manager = DBManager.getInstance();
	Connection myConn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void SalGradelist() throws Exception {

		try {
			String query = "select * from salgrade";
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\n");
			}
		} catch (Exception e) {
			System.out.println("½ÇÆÐ!");
			e.getMessage();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		}
	}
}
