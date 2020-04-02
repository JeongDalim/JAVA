package oracle.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.db.DBManager;

public class EmployeeDAO {
	DBManager manager = DBManager.getInstance();
	Connection myConn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public int employeecount() throws Exception {
		int counter = 0;
		String query = "select count(*) from employee";
		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				counter = rs.getInt(1); // re.getInt(counter);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}

			if (myConn != null) {
				myConn.close();
			}
		}
		return counter;
	}

	public int employeeSelect(int dno) throws Exception {
		int counter = 0;
		String query = "select count(*) as counter from employee where dno=" + dno;
		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				counter = rs.getInt(1); // re.getInt(counter);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}

			if (myConn != null) {
				myConn.close();
			}
		}
		return counter;
	}
}
