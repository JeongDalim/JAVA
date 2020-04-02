package oracle.sql;

import java.sql.*;

import oracle.db.OracleConn;

public class OracleSQL extends OracleConn {
	Statement stmt = null;
	ResultSet rs = null;

	public int deptInsert() throws Exception {
		int row = 0;
		String query = "insert into dept values (22,'AAA','BBB')";
		stmt = myConn.createStatement();
		row = stmt.executeUpdate(query);
		return row;
	}

	public void deptSelect() throws Exception {
		String query = "select * from dept";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.println(rs.getString(3) + "\n");
		}
	}
	@Override
	public void cleanUp() throws Exception {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
	}
}