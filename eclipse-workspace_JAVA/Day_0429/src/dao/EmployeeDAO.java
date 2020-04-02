package dao;

import java.sql.*;
import db.DBManager;

public class EmployeeDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public ResultSet method() {
		String sql = "select * from employee";
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			System.out.println("¿À·ù");
			e.printStackTrace();
		}
		return rs;
	}
}
